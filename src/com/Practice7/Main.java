package com.Practice7;

public class Main {

    public static void main(String[] args) {

        Cup teaCup = new Cup("green", "tea");
        Fork fork = new Fork("blue", 3);

        teaCup.wash(); fork.wash();

        System.out.print("\n");

        teaCup.drink();
        fork.countTines();

        System.out.print("\n");



        ChowChow puppy = new ChowChow("gary", "red", 5);
        ShibaInu doge = new ShibaInu("cheems", "yellow", 3);

        puppy.barkInfo(); doge.barkInfo();

        System.out.print("\n");

        puppy.jump();
        doge.bonk();

        System.out.print("\n");



        Chair chair = new Chair(5,3,7,228.0, "black chair", "black");
        Bed bed1 = new Bed(10, 10, 5, 1337.0, "white bed", "white");
        Bed bed2 = new Bed(12,12,6,420.0, "red bed", "red");

        FurnitureShop shop = new FurnitureShop();

        shop.addItem(chair); shop.addItem(bed1); shop.addItem(bed2);

        shop.printAds();

        System.out.print("\n");

        shop.printItems();

        System.out.print("\n");

        shop.removeItem(bed1);

        shop.printItems();

    }

}
