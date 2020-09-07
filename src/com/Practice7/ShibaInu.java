package com.Practice7;

public class ShibaInu extends Dog {

    public ShibaInu() {}

    public ShibaInu(String name, String color, int age) {
        super(name,color,age);
    }



    @Override
    public void barkInfo() {
        System.out.println("I am a " + this.color + " SHIBA INU dog, my name is " + this.name + " and I am " + this.age + " years old!");
    }

    public void bonk() {
        System.out.println("pls don't bonk me or i'll crack");
    }



    @Override
    public String toString() {
        return "My breed is Shiba Inu";
    }


}
