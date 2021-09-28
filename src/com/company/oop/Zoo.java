package com.company.oop;

public class Zoo {

    public static void mainZoo(){
        Animal lion = new Animal("Lion", 2, "Male", 120);
        lion.speak();
        lion.eat();
        lion.sleep();
        System.out.println("*************");
        Bird bird = new Bird("Bird", 2, "Female", 2);
        bird.speak();
        bird.fly();
        bird.eat();
        bird.sleep();
    }
}
