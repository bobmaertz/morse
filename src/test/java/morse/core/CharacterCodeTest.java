package com.bou1der.morse.domain.entities;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCodeTest
{

    @Test
    void getMorseCodeSequence()
    {
        assertEquals(Arrays.asList(MorseCode.DOT, MorseCode.DASH),MorseCharacter.A.getMorseCodeSequence());
    }

    @Test
    void fromChar()
    {
        assertEquals(MorseCharacter.A, MorseCharacter.fromChar('a'));
    }
}