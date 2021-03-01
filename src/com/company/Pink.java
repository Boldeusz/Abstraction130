package com.company;

public class Pink extends Bird {
    public Pink(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
