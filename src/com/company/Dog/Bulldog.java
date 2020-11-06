package com.company.Dog;

public class Bulldog extends Dog {

    public Bulldog() {}

    public Bulldog(String name, String color, int age) {
        super(name,color,age);
    }

    @Override
    public void bark() {
        System.out.println("I am a " + this.color + " Bulldog dog, my name is " + this.name + " and I am " + this.age + " years old");
    }

    public void act() {
        System.out.println("I brought a bone");
    }



}
