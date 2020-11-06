package com.company.Furniture;
import java.util.ArrayList;

public class FurnitureShop {

    protected ArrayList<Furniture> furnitures = new ArrayList<>();

    public FurnitureShop() {}



    public void add_item(Furniture item) {
        furnitures.add(item);
    }

    public void remove_item(Furniture item) {
        furnitures.remove(item);
    }

    public void print_items() {
        for (Furniture item : furnitures) {
            item.printInfo();
        }
    }

    public void print_ads() {
        for (Furniture item : furnitures) {
            item.made_of();
        }
    }

}
