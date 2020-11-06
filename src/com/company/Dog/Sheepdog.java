package com.company.Dog;

public class Sheepdog extends Dog {

    public Sheepdog() {}

    public Sheepdog(String name, String color, int age) {
        super(name,color,age);
    }

    @Override
    public void bark() {
        System.out.println("I am a " + this.color + " Sheepdog dog, my name is " + this.name + " and I am " + this.age + " years old");
    }

    public void bonk() {
        System.out.println("I jumped over the fence");
    }



}
