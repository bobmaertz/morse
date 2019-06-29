package morse.core;


public enum MorseCode
{

    BREAK(1),
    CHARACTER_BREAK(4),
    WORD_BREAK(7),
    DOT(1),
    DASH(3);

    //This is an eraly feature that will be expanded on later. 
    //If someone where to use this library to actually generated working, 
    //morse code, they would need a way to keep the time for each of the 
    //code types. This is the time multiplier that occurs for each 
    //code type. 
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
