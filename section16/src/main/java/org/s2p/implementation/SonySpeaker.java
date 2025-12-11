package org.s2p.implementation;

import org.s2p.interfaces.Speaker;

public class SonySpeaker implements Speaker
{
    public SonySpeaker()
    {
        System.out.println("Sony Speaker Bean Created By User");
    }

    @Override
    public String makeSound() {
        return "Playing music with Sony speaker";
    }
}
