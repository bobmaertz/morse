package morse.core;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCodeTest
{

    @Test
    void getMorseCodeSequence()
    {
        assertEquals(Arrays.asList(MorseCode.DOT, MorseCode.DASH),Character.A.getMorseCodeSequence());
    }

    @Test
    void fromChar()
    {
        assertEquals(Character.A, Character.fromChar('a'));
    }
}