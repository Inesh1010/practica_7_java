package com.company.Dish;

public class Fork extends Dish {

    protected int amountOfTines;


    public Fork() {}

    public Fork(String color, int amountOfTines) {
        super(color);
        this.amountOfTines = amountOfTines;
    }



    @Override
    public void keep() {
        System.out.println("keeping " + this.color + " fork");
    }

    public void count_tines() {
        System.out.println("This fork have " + this.amountOfTines + "tines");
    }


}
