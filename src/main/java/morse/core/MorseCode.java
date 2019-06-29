package morse;

/**
 * Grammar code defines the number of moments in MorseCode grammar.
 *
 */
public enum MorseCode
{

    BREAK(1),
    CHARACTER_BREAK(4),
    WORD_BREAK(7),
    DOT(1),
    DASH(3);

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
