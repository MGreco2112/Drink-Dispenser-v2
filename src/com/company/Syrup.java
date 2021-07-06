package com.company;

public class Syrup {
    public String name;
    public int vol;


    public Syrup(String name, int vol) {
        this.name = name;
        this.vol = vol;
    }

    public String dispense(int amt) {
        vol -= amt;

        return name;
    }

    public int getVol() {
        return vol;
    }




}
