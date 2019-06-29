package morse.core;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class CharacterCodeTest
{

    @Test
    public void testMorseCodeSequence()
    {
        assertEquals(Arrays.asList(MorseCode.DOT, MorseCode.DASH),Character.A.getMorseCodeSequence());
    }

    @Test
    public void testfromChar()
    {
        assertEquals(Character.A, Character.fromChar('a'));
    }
}