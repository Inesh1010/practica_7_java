package com.company.Furniture;

public class Table extends Furniture {

    public Table() {}

    public Table(int width, int length, int height, double price, String model, String color) {
        super(width, length, height, price, model, color);
    }

    @Override
    public void made_of() {
        System.out.println("I am made of 4 sticks");
    }


}
