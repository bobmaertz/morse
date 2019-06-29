package morse.core;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class EncoderTest
{
    @Test
    public void testEncodeStringWithNumericChars(){
        final String numericString = "1234567890";
        
        final List<MorseCode> expectedOutput = new ArrayList<MorseCode>();
        expectedOutput.addAll(Character.ONE.getMorseCodeSequence());
        expectedOutput.addAll(Character.TWO.getMorseCodeSequence());
        expectedOutput.addAll(Character.THREE.getMorseCodeSequence());
        expectedOutput.addAll(Character.FOUR.getMorseCodeSequence());
        expectedOutput.addAll(Character.FIVE.getMorseCodeSequence());
        expectedOutput.addAll(Character.SIX.getMorseCodeSequence());
        expectedOutput.addAll(Character.SEVEN.getMorseCodeSequence());
        expectedOutput.addAll(Character.EIGHT.getMorseCodeSequence());
        expectedOutput.addAll(Character.NINE.getMorseCodeSequence());
        expectedOutput.addAll(Character.ZERO.getMorseCodeSequence());

        Encode encoder = new Encoder(); 

        List<MorseCode> actualOutput = encoder.encode(numericString);

        Assertions.assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    public void testEncodeStringWithEmptyNullInput(){
        final String emptyString = "";

        Encode encoder = new Encoder(); 

        List<MorseCode> actualOutput = encoder.encode(emptyString);
        Assertions.assertThat(actualOutput).isEmpty();
        
        actualOutput = encoder.encode(null);
        Assertions.assertThat(actualOutput).isEmpty();
    }

}