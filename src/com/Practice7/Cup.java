package com.Practice7;

public class Cup extends Dish {

    protected String contents;



    public Cup() {}

    public Cup(String color, String contents) {
        super(color);
        this.contents = contents;
    }



    @Override
    public void wash() {
        System.out.println("Washing " + this.color + " cup!");
    }

    public void drink() {
        System.out.println("Drinking " + this.contents + "!");
    }


    @Override
    public String toString() {
        return this.color + " cup filled with " + this.contents;
    }

}
