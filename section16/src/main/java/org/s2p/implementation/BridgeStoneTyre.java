package org.s2p.implementation;

import org.s2p.interfaces.Tyres;

public class BridgeStoneTyre implements Tyres
{

    public BridgeStoneTyre()
    {
        System.out.println("BridgeStoneTyre Bean Created By User");
    }

    @Override
    public String rotate()
    {
        return "Vehicle moving with BridgeStone tyres";
    }
}
