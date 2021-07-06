package com.company;

public class CupHolder {
    public int vol;
    public int qty = 0;

    public CupHolder(int vol) {
        this.vol = vol;
    }

    public int dispenseCup() {
        qty--;
        return vol;
    }

    public void refill(int amt) {
        qty += amt;
    }
}
