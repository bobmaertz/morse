package morse.core;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class CharacterCodeTest
{

    @Test
    public void getMorseCodeSequence()
    {
        assertEquals(Arrays.asList(MorseCode.DOT, MorseCode.DASH),Character.A.getMorseCodeSequence());
    }

    @Test
    public void fromChar()
    {
        assertEquals(Character.A, Character.fromChar('a'));
    }
}