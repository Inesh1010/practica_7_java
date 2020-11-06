package com.company.Dish;

public class Cup extends Dish {

    protected String liquid;



    public Cup() {}

    public Cup(String color, String liquid) {
        super(color);
        this.liquid = liquid;
    }



    @Override
    public void keep() {
        System.out.println("keeping " + this.color + " cup");
    }

    public void pour() {
        System.out.println("pouring " + this.liquid + "into the cup");
    }


    @Override
    public String toString() {
        return this.color + " cup filled with " + this.liquid;
    }

}
