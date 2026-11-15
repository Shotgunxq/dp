package benchmark;

import static benchmark.GoldenMaster.combinations;
import static benchmark.GoldenMaster.verify;

import org.junit.jupiter.api.Test;

/**
 * B1 golden master for {@link IbanValidator}.
 * Input rule: a few IBANs a user would have at hand (valid ones, typos, formatting variants)
 * plus simple edge inputs, chosen without analysing the private methods.
 */
class IbanValidatorGoldenMasterTest {

    @Test
    void validate() {
        IbanValidator validator = new IbanValidator();
        verify(getClass(), "validate", combinations(
                a -> validator.validate((String) a[0]) + " / valid=" + validator.isValid((String) a[0]),
                new String[] {
                    null, "", "   ", "SK",
                    "SK31 1200 0000 1987 4263 7541", "sk31 1200 0000 1987 4263 7541",
                    "SK31-1200-0000-1987-4263-7541", "SK3112000000198742637541",
                    "SK31 1200 0000 1987 4263 7540", "SK31 1200 0000 1987 4263 754",
                    "SK31 1200 0000 1987 4263 7541 0",
                    "DE89 3704 0044 0532 0130 00", "DE89 3704 0044 0532 0130 01",
                    "AT61 1904 3002 3457 3201", "GB82 WEST 1234 5698 7654 32",
                    "CZ65 0800 0000 1920 0014 5399", "HU42 1177 3016 1111 1018 0000 0000",
                    "PL61 1090 1014 0000 0712 1981 2874",
                    "FR76 3000 6000 0112 3456 7890 189", "US12 3456 7890 1234 5678",
                    "SK31 1200 0000 1987 4263 75O1", "SK31 1200 0000 1987 4263 754!",
                    "1234567890123456789012345678901234567890"}));
    }
}
