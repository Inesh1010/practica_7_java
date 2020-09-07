package com.Practice7;

public abstract class Dog {

    protected String name;
    protected String color;
    protected int age;

    public Dog() {}

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }



    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getColor() { return this.color; }
    public void setColor(String color) { this.color = color; }

    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }



    public abstract void barkInfo();

}
