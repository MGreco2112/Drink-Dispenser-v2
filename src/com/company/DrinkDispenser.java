package com.company;

import java.util.*;

public class DrinkDispenser {
    ArrayList<Syrup> syrups = new ArrayList<>();
    ArrayList<Shots> shots = new ArrayList<>();
    public CupHolder small;
    public CupHolder medium;
    public CupHolder large;

    public DrinkDispenser(int sm, int med, int lg) {
        small = new CupHolder(sm);
        medium = new CupHolder(med);
        large = new CupHolder(lg);
    }

    public void serveDrink(String size, int syrupI) {
        int vol;
        switch (size.toLowerCase(Locale.ROOT)) {
            case "s" :
                vol = small.dispenseCup();
                break;
            case "m" :
                vol = medium.dispenseCup();
                break;
            case "l" :
                vol = large.dispenseCup();
                break;
            default:
                System.out.println("ERROR: invalid size");
                return;
        }

        String drink = syrups.get(syrupI).dispense(vol);

//        syrups.get(syrupI).dispense(vol);

        System.out.printf("%s %s\n", size, drink);

//        System.out.println(size + " " + drink);


    }

    public void serveDrink(String size, int syrupI, int shotI) {
        int vol;
        switch (size.toLowerCase(Locale.ROOT)) {
            case "s" :
                vol = small.dispenseCup();
                break;
            case "m" :
                vol = medium.dispenseCup();
                break;
            case "l" :
                vol = large.dispenseCup();
                break;
            default:
                System.out.println("ERROR: invalid size");
                return;
        }

        String drink = syrups.get(syrupI).dispense(vol);
        String shot = shots.get(shotI).dispense();

//        syrups.get(syrupI).dispense(vol);

        System.out.printf("%s %s %s\n", size, drink, shot);

//        System.out.println(size + " " + drink);


    }



    public void addSyrup(Syrup newSyrup) {
        syrups.add(newSyrup);
    }

    public void addSyrup(String name, int val) {
        syrups.add(new Syrup(name, val));
    }

    public List<String> lowSyrups(int lowValue) {
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < syrups.size(); i++) {
            if (syrups.get(i).getVol() <= lowValue) {
                output.add(i + " " + syrups.get(i).name);
            }
        }

        return output;

    }

    public List<String> lowShots(int lowValue) {
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < shots.size(); i++) {
            if (shots.get(i).getVol() <= lowValue) {
                output.add(i + " " + shots.get(i).name);
            }
        }

        return output;

    }

    public void addShot(Shots newShot) {
        shots.add(newShot);
    }

    public void addShot(String name, int vol, int amt) {
        shots.add(new Shots(name, vol, amt));
    }


}
