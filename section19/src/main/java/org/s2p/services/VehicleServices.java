package org.s2p.services;

import org.s2p.implementation.BoseSpeaker;
import org.s2p.implementation.MichelinTyres;
import org.s2p.interfaces.Speaker;
import org.s2p.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class VehicleServices
{
    private Speaker speaker;
    private Tyres tyres;

    @Autowired
    VehicleServices(Speaker speaker,@Qualifier("michelinTyresBean") Tyres tyres)
    {
        this.speaker = speaker;
        this.tyres   = tyres;
        System.out.println("VehicleServices Bean Created By Spring Framework");
    }

    public void playMusic()
    {
        String music = speaker.makeSound();
        System.out.println(music);
    }

    public void moveVehicle()
    {
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
