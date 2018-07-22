package com.bou1der.morse.domain.boundary;

import com.bou1der.morse.domain.entities.MorseCode;

import java.util.List;

public interface Response
{
    public void setMessage(List<MorseCode> message);
}
