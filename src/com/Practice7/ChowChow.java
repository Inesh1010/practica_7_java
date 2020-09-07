package com.Practice7;

public class ChowChow extends Dog {

    public ChowChow() {}

    public ChowChow(String name, String color, int age) {
        super(name,color,age);
    }



    @Override
    public void barkInfo() {
        System.out.println("I am a " + this.color + " CHOW CHOW dog, my name is " + this.name + " and I am " + this.age + " years old!");
    }

    public void jump() {
        System.out.println("I'm jumped!");
    }



    @Override
    public String toString() {
        return "My breed is chow chow";
    }

}
