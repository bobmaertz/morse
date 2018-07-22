package com.bou1der.morse.domain.interactors;

import com.bou1der.morse.data.gateway.MessageGateway;
import com.bou1der.morse.domain.boundary.Response;
import com.bou1der.morse.domain.boundary.StringRequest;
import com.bou1der.morse.domain.entities.MorseCharacter;
import com.bou1der.morse.domain.entities.MorseCode;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringToMorse
{

    /**
     * This will eventually be replaced by dependency injection in spring.
     * @param gateway
     * @return
     */
    public static ConvertStringToMorse create(MessageGateway gateway)
    {
        return new ConvertStringToMorse(gateway);
    }

    public void execute(StringRequest request, Response response)
    {
        //TODO: Check for Request encoding...
        List<MorseCode> encodedCharacters = new ArrayList<MorseCode>();

        for(char c : request.getMessage().toCharArray())
        {
            if (Character.isWhitespace(c))
            {
                //DEVNOTE: What if there are multiple spaces? - Post process to make duplicates go away
                encodedCharacters.add(MorseCode.WORD_BREAK);
            } else {
                for(MorseCode codeChar : MorseCharacter.fromChar(c).getMorseCodeSequence())
                {
                    encodedCharacters.add(codeChar);
                    encodedCharacters.add(MorseCode.BREAK);
                }
                encodedCharacters.add(MorseCode.CHARACTER_BREAK);
            }
        }

        gateway.send(encodedCharacters);

        //TODO: Remove me - Good for testing now
        response.setMessage(encodedCharacters);
    }

    private MessageGateway gateway;

    //@Autowired
    public ConvertStringToMorse(MessageGateway gateway)
    {
        this.gateway = gateway;
    }


}
