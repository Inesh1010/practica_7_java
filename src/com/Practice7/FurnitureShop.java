package com.Practice7;
import java.util.ArrayList;

public class FurnitureShop {

    protected ArrayList<Furniture> furnitures = new ArrayList<>();

    public FurnitureShop() {}



    public void addItem(Furniture item) {
        furnitures.add(item);
    }

    public void removeItem(Furniture item) {
        furnitures.remove(item);
    }

    public void printItems() {
        for (Furniture item : furnitures) {
            item.printInfo();
        }
    }

    public void printAds() {
        for (Furniture item : furnitures) {
            item.advertise();
        }
    }

}
