package com.company;

import com.company.Dish.*;
import com.company.Dog.*;
import com.company.Furniture.*;


public class Main {

    public static void main(String[] args) {

        //Проверка Dish
        Dish cup_of_1 = new Cup("white", "tea");
        Cup cup_of_2 = new Cup("green", "coffee");

        cup_of_1.keep();
        System.out.print("\n");
        cup_of_2.pour();
        System.out.print("\n");

        Dish fork_1 = new Fork("blue", 3);
        Fork fork_2 = new Fork("grey", 2);

        fork_1.keep();
        System.out.print("\n");
        fork_2.count_tines();
        System.out.print("\n");

        //////////////////////////////////////////////////////////


        Bulldog puppy_1 = new Bulldog("Jak", "white", 3);
        Sheepdog puppy_2 = new Sheepdog("Anne", "yellow", 3);

        puppy_1.bark();
        puppy_1.act();
        System.out.print("\n");

        puppy_2.bark();
        puppy_2.bonk();
        System.out.print("\n");

        ////////////////////////////////////////////////////////


        Chair chair = new Chair(5,3,7,228.0, "black chair", "black");
        Table table1 = new Table(10, 10, 5, 1337.0, "white bed", "white");
        Table table2 = new Table(12,12,6,420.0, "red bed", "red");
        chair.made_of();
        table1.made_of();
        table2.made_of();
        FurnitureShop shop = new FurnitureShop();
        shop.add_item(chair); shop.add_item(table1); shop.add_item(table2);
        shop.print_ads();
        System.out.print("\n");
        shop.print_items();
        System.out.print("\n");
        shop.remove_item(table1);
        shop.print_items();

    }

}
