package com.company.Furniture;

public class Chair extends Furniture {

    public Chair() {}

    public Chair(int width, int length, int height, double price, String model, String color) {
        super(width, length, height, price, model, color);
    }

    @Override
    public void made_of() {
        System.out.println("I am made of 2 sticks");
    }


}
