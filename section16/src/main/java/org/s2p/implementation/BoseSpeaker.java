package org.s2p.implementation;

import org.s2p.interfaces.Speaker;

public class BoseSpeaker implements Speaker
{
    public BoseSpeaker()
    {
        System.out.println("BoseSpeaker Bean Created By User");
    }

    @Override
    public String makeSound()
    {
        return "Playing music with Bose speakers";
    }
}
