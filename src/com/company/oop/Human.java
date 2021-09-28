package com.company.oop;

public class Human {

    private String name;
    private int age;
    private double height;
    private String eyeColor;

    public Human(String name, int age, double height, String eyeColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is " + this.name);
        System.out.println("I am " + this.height + " cm tall");
        System.out.println("I am " + this.age + " years old");
        System.out.println("My eye color is " + this.eyeColor);
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void work(){
        System.out.println("Working...");
    }
}
