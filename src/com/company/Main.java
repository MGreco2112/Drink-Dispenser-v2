package com.company;

public class Main {

    public static void main(String[] args) {
	    DrinkDispenser cliffsDispenser = new DrinkDispenser(5, 8, 12);

	    cliffsDispenser.small.refill(50);
	    cliffsDispenser.medium.refill(50);
	    cliffsDispenser.large.refill(50);

	    cliffsDispenser.addSyrup(new Syrup("Purple Drink", 1000));
	    cliffsDispenser.addSyrup("Blue Drink", 600);
	    cliffsDispenser.addSyrup(new Syrup("Orange", 758));
	    cliffsDispenser.addSyrup("Dr Cliff", 112);

//		System.out.printf("m cups: %d %d\t drink 3 volume\n", cliffsDispenser.medium.qty,
//				cliffsDispenser.syrups.get(3).getVol());
//
//	    cliffsDispenser.serveDrink("M", 3);
//		System.out.printf("m cups: %d %d\t drink 3 volume\n", cliffsDispenser.medium.qty,
//				cliffsDispenser.syrups.get(3).getVol());
//
//		cliffsDispenser.serveDrink("L", 3);
//
//		System.out.println(cliffsDispenser.lowSyrups(100));


    }
}
