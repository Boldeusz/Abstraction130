package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();
        Pink pink = new Pink("Australian pink");
        pink.breath();
        pink.eat();
        pink.fly();
        Penguin penguin = new Penguin("Penguin");
        penguin.fly();
    }
}
