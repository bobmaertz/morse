package com.bou1der.morse.data.gateway;

import com.bou1der.morse.domain.entities.MorseCode;

import java.util.List;

public interface MessageGateway
{
    public void send(List<MorseCode> encodedChars);
}
