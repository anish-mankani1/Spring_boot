package org.s2p.implementation;

import org.s2p.interfaces.Tyres;

public class MichelinTyres implements Tyres
{

    public MichelinTyres()
    {
        System.out.println("Michelin Bean Created By User");
    }

    @Override
    public String rotate() {
        return "Moving vehicle with Michelin tyres";
    }
}
