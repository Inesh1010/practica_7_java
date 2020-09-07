package com.Practice7;

public class Fork extends Dish {

    protected int amountOfTines;


    public Fork() {}

    public Fork(String color, int amountOfTines) {
        super(color);
        this.amountOfTines = amountOfTines;
    }



    @Override
    public void wash() {
        System.out.println("Washing " + this.color + " fork!");
    }

    public void countTines() {
        System.out.println("This fork have " + this.amountOfTines + "!");
    }



    @Override
    public String toString() {
        return this.color + "fork with " + this.amountOfTines;
    }

}
