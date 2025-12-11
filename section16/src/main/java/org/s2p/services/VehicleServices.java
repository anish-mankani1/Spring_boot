package org.s2p.services;

import org.s2p.implementation.BoseSpeaker;
import org.s2p.implementation.MichelinTyres;
import org.s2p.interfaces.Speaker;
import org.s2p.interfaces.Tyres;

public class VehicleServices
{
    private Speaker speaker;
    private Tyres tyres;

    // Default Constructor
    public VehicleServices()
    {
        speaker = new BoseSpeaker();
        tyres   = new MichelinTyres();
        System.out.println("VehicleService Bean Created By User");
    }

    // All Arguments Constructor
    public VehicleServices(Speaker speaker, Tyres tyres)
    {
        this.speaker = speaker;
        this.tyres   = tyres;
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
