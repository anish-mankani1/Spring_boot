package org.s2p.implementation;

import org.s2p.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker
{
    public BoseSpeaker()
    {
        System.out.println("BoseSpeaker Bean Created By Spring Framework");
    }

    @Override
    public String makeSound() {
        return "Playing music with Bose speakers";
    }
}
