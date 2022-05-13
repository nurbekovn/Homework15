package com.company;

public class Eagle extends com.company.peaksoft.Animal {

    public void fly(){
        System.out.println(" method - can fly ");
    }
    @Override
    public void eat() {
        System.out.println("Eagle eat");
    }

    @Override
    public String toString() {
        return "Eagle";
    }
}
