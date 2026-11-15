package benchmark;

import java.math.BigInteger;

/**
 * B12 - Complex logic hidden in private methods.
 *
 * <p>Only {@link #validate(String)} is public. Normalisation, the country check, the character
 * rearrangement and the mod-97 checksum are private, so every branch in them can be reached only
 * by crafting the right input string for the single public entry point.
 */
public class IbanValidator {

    public enum Result { VALID, EMPTY, TOO_SHORT, TOO_LONG, BAD_COUNTRY, BAD_LENGTH_FOR_COUNTRY, BAD_CHARACTER, BAD_CHECKSUM }

    private static final BigInteger NINETY_SEVEN = BigInteger.valueOf(97);

    public Result validate(String input) {
        String iban = normalise(input);
        if (iban.isEmpty()) {
            return Result.EMPTY;
        }
        if (iban.length() < 5) {
            return Result.TOO_SHORT;
        }
        if (iban.length() > 34) {
            return Result.TOO_LONG;
        }
        if (!isLetter(iban.charAt(0)) || !isLetter(iban.charAt(1))) {
            return Result.BAD_COUNTRY;
        }
        int expected = expectedLength(iban.substring(0, 2));
        if (expected < 0) {
            return Result.BAD_COUNTRY;
        }
        if (iban.length() != expected) {
            return Result.BAD_LENGTH_FOR_COUNTRY;
        }
        if (!hasOnlyLettersAndDigits(iban)) {
            return Result.BAD_CHARACTER;
        }
        return checksumOk(rearrange(iban)) ? Result.VALID : Result.BAD_CHECKSUM;
    }

    public boolean isValid(String input) {
        return validate(input) == Result.VALID;
    }

    private static String normalise(String input) {
        if (input == null) {
            return "";
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ' && c != '-') {
                out.append(Character.toUpperCase(c));
            }
        }
        return out.toString();
    }

    private static boolean isLetter(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static boolean hasOnlyLettersAndDigits(String iban) {
        for (int i = 0; i < iban.length(); i++) {
            char c = iban.charAt(i);
            if (!isLetter(c) && (c < '0' || c > '9')) {
                return false;
            }
        }
        return true;
    }

    /** IBAN length per country for a handful of countries; -1 = unknown country. */
    private static int expectedLength(String country) {
        switch (country) {
            case "SK":
            case "CZ":
                return 24;
            case "AT":
                return 20;
            case "DE":
                return 22;
            case "HU":
            case "PL":
                return 28;
            case "GB":
                return 22;
            default:
                return -1;
        }
    }

    /** Moves the first four characters to the end and replaces letters with 10..35. */
    private static String rearrange(String iban) {
        String moved = iban.substring(4) + iban.substring(0, 4);
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < moved.length(); i++) {
            char c = moved.charAt(i);
            if (isLetter(c)) {
                digits.append(c - 'A' + 10);
            } else {
                digits.append(c);
            }
        }
        return digits.toString();
    }

    private static boolean checksumOk(String digits) {
        return new BigInteger(digits).mod(NINETY_SEVEN).intValue() == 1;
    }
}
