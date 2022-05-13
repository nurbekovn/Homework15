package com.company.peaksoft;


public class Turtle extends com.company.peaksoft.Animal {


    public void swim() {
        System.out.println(" method - can swim");
    }

    @Override
    public void eat(){
        System.out.println("Turtle eat");
    }

    @Override
    public String toString() {
        return "Turtle";
    }
}
