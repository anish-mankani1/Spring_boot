package org.s2p.implementation;

import org.s2p.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component(value = "BridgeStoneTyresBean")
public class BridgeStoneTyre implements Tyres
{
    public BridgeStoneTyre()
    {
        System.out.println("BridgeStoneTyre Bean Created By Spring Framework");
    }

    @Override
    public String rotate() {
        return "Vehicle moving with BridgeStone tyres";
    }
}
