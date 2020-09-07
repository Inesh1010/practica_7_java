package com.Practice7;

public class Chair extends Furniture {

    public Chair() {}

    public Chair(int width, int length, int height, double price, String model, String color) {
        super(width, length, height, price, model, color);
    }



    @Override
    public void advertise() {
        System.out.println("PLEASE BUY ME! YOU CAN SIT ON ME! I'LL BRING COMFORT TO YOU!!!");
    }



    @Override
    public String toString() {
        return "I am a chair actually";
    }


}
