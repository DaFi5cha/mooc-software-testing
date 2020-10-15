package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher cipher;

    @BeforeEach
    public void initialize() {
        this.cipher = new CaesarShiftCipher();
    }

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({"a,2,c", "bc-,4,invalid", "A,4,invalid", "aba,2,cdc", "aba,-2,yzy", "hi,0,hi"})
    public void Testcase(String message, int shift, String expected) {
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }
}
