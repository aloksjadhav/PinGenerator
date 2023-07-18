package test.java;

import main.java.PinGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class PinGeneratorTests {

    java.util.logging.Logger log = java.util.logging.Logger.getLogger("PinGeneratorTests");

    @InjectMocks
    PinGenerator pinGenerator;

    @Test
    public void testPinGenerator() {
        Set<Integer> resultSet = pinGenerator.getFourDigitPins();

        //total generated pins = 1000
        Assert.assertEquals(1000, resultSet.size());
        resultSet.forEach(a -> {
            //pin should be 4-digit number
            Assert.assertTrue(0 < a / 1000 && a / 1000 < 10);
            log.log(java.util.logging.Level.INFO, Integer.toString(a));
        });


    }
}
