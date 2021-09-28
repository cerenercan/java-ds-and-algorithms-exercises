package com.company.oop;

public class Animal {

    private String name;
    private int age;
    private String gender;
    private double weight;

    public Animal(String name, int age, String gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void speak(){
        System.out.println("Animal -> Speaking...");
        System.out.println("My name is: " + this.name);
        System.out.println("My age is: " + this.age);
        System.out.println("My gender is: " + this.gender);
        System.out.println("My weight is: " + this.weight);
    }

    public void eat(){
        System.out.println("Animal -> Eating...");
    }

    public void sleep(){
        System.out.println("Animal -> Sleeping...");
    }
}
