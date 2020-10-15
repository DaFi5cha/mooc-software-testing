package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    private GHappy happy;
    
    @BeforeEach
    public void initialize() {
        this.happy = new GHappy();
    }
    
    @ParameterizedTest(name = "string={0}, result={1}")
    @CsvSource({"ff,false", "g,false", "gg,true", "ggg,true", "ggxg,false", "ggxgg,true", "gxg,false", "x,false", "xg,false"})
    public void totalIsTooBig(String string, boolean expectedResult) {
        boolean result = happy.gHappy(string);
        Assertions.assertEquals(expectedResult, result);
    }

}
