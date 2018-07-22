package com.bou1der.morse.domain.entities;

/**
 * Grammar code defines the number of moments in MorseCode grammar. This can be used by the presentation layer to
 * determine how to display to the user.
 *
 */
public enum MorseCode
{

    BREAK(1),
    CHARACTER_BREAK(4),
    WORD_BREAK(7),
    DOT(1),
    DASH(3);

//    /**
//     * timeBetweenStrikes - milliseconds between each strike
//     *
//     */
//    private final int timeBetweenStrikes = 500;

    /**
     * Differentiates between breaks/dots/dashes etc...
     */
    private final int moment;

    MorseCode(int moment)
    {
        this.moment = moment;
    }

    public int getCharacterMoment()
    {
        return this.moment;
    }
}
