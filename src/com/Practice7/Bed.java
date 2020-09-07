package com.Practice7;

public class Bed extends Furniture {

    public Bed() {}

    public Bed(int width, int length, int height, double price, String model, String color) {
        super(width, length, height, price, model, color);
    }



    @Override
    public void advertise() {
        System.out.println("HELLO THERE! I'M ON SALE AND YOU NEED ME! IF YOU FEEL TIRED YOU CAN LAY ON ME AND RELAX.");
    }



    @Override
    public String toString() {
        return "Very comfortable bed";
    }

}
