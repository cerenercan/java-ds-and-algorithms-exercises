package com.company.oop;

public class Bird extends Animal{

    public Bird(String name, int age, String gender, double weight) {
        super(name, age, gender, weight);
    }

    @Override
    public void speak() {
        System.out.println("Bird -> Speaking...");
        super.speak();
    }

    @Override
    public void eat() {
        System.out.println("Bird -> Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Bird -> Sleeping...");
    }

    public void fly(){
        System.out.println("Bird -> Flying...");
    }
}
