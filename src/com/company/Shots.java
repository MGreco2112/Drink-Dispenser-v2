package com.company;

public class Shots {

    public String name;
    public int vol;
    public int amt;


    public Shots(String name, int vol, int amt) {
        this.name = name;
        this.vol = vol;
        this.amt = amt;
    }

    public String dispense() {
        vol -= amt;
        return name;
    }

    public double getVol() {
        return vol / amt;
    }
}
