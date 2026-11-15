package benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import benchmark.IbanValidator.Result;
import org.junit.jupiter.api.Test;

/** Hand-written reference suite (human baseline) for {@link IbanValidator}. */
class IbanValidatorReferenceTest {

    private final IbanValidator validator = new IbanValidator();

    @Test
    void validIbansOfSeveralCountries() {
        assertEquals(Result.VALID, validator.validate("SK31 1200 0000 1987 4263 7541"));
        assertEquals(Result.VALID, validator.validate("CZ65 0800 0000 1920 0014 5399"));
        assertEquals(Result.VALID, validator.validate("AT61 1904 3002 3457 3201"));
        assertEquals(Result.VALID, validator.validate("DE89 3704 0044 0532 0130 00"));
        assertEquals(Result.VALID, validator.validate("GB82 WEST 1234 5698 7654 32"));
        assertEquals(Result.VALID, validator.validate("PL61 1090 1014 0000 0712 1981 2874"));
        assertEquals(Result.VALID, validator.validate("HU42 1177 3016 1111 1018 0000 0000"));
        assertTrue(validator.isValid("DE89370400440532013000"));
    }

    @Test
    void normalisationIgnoresSpacesDashesAndCase() {
        assertEquals(Result.VALID, validator.validate("sk31-1200-0000-1987-4263-7541"));
        assertEquals(Result.VALID, validator.validate("  gb82 west 1234 5698 7654 32  "));
    }

    @Test
    void emptyAndNull() {
        assertEquals(Result.EMPTY, validator.validate(null));
        assertEquals(Result.EMPTY, validator.validate(""));
        assertEquals(Result.EMPTY, validator.validate(" - - "));
        assertFalse(validator.isValid(null));
    }

    @Test
    void lengthLimits() {
        assertEquals(Result.TOO_SHORT, validator.validate("SK31"));
        assertEquals(Result.BAD_LENGTH_FOR_COUNTRY, validator.validate("SK311"));
        assertEquals(Result.TOO_LONG, validator.validate("SK31120000001987426375410000000000X"));
        assertEquals(Result.BAD_LENGTH_FOR_COUNTRY, validator.validate("SK3112000000198742637541000000000"));
    }

    @Test
    void countryCodeChecks() {
        assertEquals(Result.BAD_COUNTRY, validator.validate("1K31 1200 0000 1987 4263 7541"));
        assertEquals(Result.BAD_COUNTRY, validator.validate("S131 1200 0000 1987 4263 7541"));
        assertEquals(Result.BAD_COUNTRY, validator.validate("FR76 3000 6000 0112 3456 7890 189"));
    }

    @Test
    void wrongLengthForKnownCountry() {
        assertEquals(Result.BAD_LENGTH_FOR_COUNTRY, validator.validate("SK31 1200 0000 1987 4263 754"));
        assertEquals(Result.BAD_LENGTH_FOR_COUNTRY, validator.validate("DE89 3704 0044 0532 0130 001"));
    }

    @Test
    void badCharacters() {
        assertEquals(Result.BAD_CHARACTER, validator.validate("SK31 1200 0000 1987 4263 754*"));
        assertEquals(Result.BAD_CHARACTER, validator.validate("SK31 1200 0000 1987 4263 754ä"));
        assertEquals(Result.BAD_CHARACTER, validator.validate("SK31120000001987426375#1"));
        // underscores are not stripped, so the length check fires first
        assertEquals(Result.BAD_LENGTH_FOR_COUNTRY, validator.validate("SK31_1200_0000_1987_4263_7541"));
    }

    @Test
    void checksumFailures() {
        assertEquals(Result.BAD_CHECKSUM, validator.validate("SK31 1200 0000 1987 4263 7542"));
        assertEquals(Result.BAD_CHECKSUM, validator.validate("SK32 1200 0000 1987 4263 7541"));
        assertEquals(Result.BAD_CHECKSUM, validator.validate("GB82 WEST 1234 5698 7654 33"));
        assertEquals(Result.BAD_CHECKSUM, validator.validate("GB82 WESS 1234 5698 7654 32"));
        assertFalse(validator.isValid("DE00 0000 0000 0000 0000 00"));
    }
}
