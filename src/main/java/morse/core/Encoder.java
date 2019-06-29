package morse.core;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Encoder implements Encode
{
    public Encoder(){}

    public List<MorseCode> encode(String message) {
        List<MorseCode> outCodes = new ArrayList<MorseCode>();

        if(StringUtils.isEmpty(message)){
            return new ArrayList<MorseCode>();
        }
        
        for(char c : message.toCharArray()){
            Character character = Character.fromChar(c);           
            outCodes.addAll(character.getMorseCodeSequence());
        }

        return outCodes;
    }
}