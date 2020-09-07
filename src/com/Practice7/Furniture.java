package com.Practice7;

public abstract class Furniture {

    protected int width, length, height;
    protected double price;
    protected String color;
    protected String model;



    public Furniture() {}

    public Furniture(int width, int length, int height, double price, String model, String color) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.price = price;
        this.model = model;
        this.color = color;
    }



    final public int getHeight() { return this.height; }
    final public void setHeight(int height) { this.height = height; }

    final public int getWidth() { return this.width; }
    final public void setWidth(int width) { this.width = width; }

    final public int getLength() { return this.length; }
    final public void setLength(int length) { this.length = length; }

    final public double getPrice() { return this.price; }
    final public void setPrice(double price) { this.price = price; }

    final public String getColor() { return this.color; }
    final public void setColor(String color) { this.color = color; }

    final public String getModel() { return this.model; }
    final public void setModel(String model) { this.model = model; }



    final public void printInfo() {
        System.out.println("PROPERTIES:\n" +
                           "WIDTH: " + this.width + "\n" +
                           "LENGTH: " + this.length + "\n" +
                           "HEIGHT: " + this.length + "\n" +
                           "COLOR: " + this.color + "\n" +
                           "MODEL: " + this.model + "\n" +
                           "PRICE: " + this.price + "\n");
    }



    public abstract void advertise();

}
