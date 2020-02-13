package com.ykb.training.oo.example;

public class Kangroo implements IAnimal {

    @Override
    public void sound() {
        System.out.println("cirt");
    }

    @Override
    public void eat() {
        System.out.println("Grass");
    }

    @Override
    public void move() {
        System.out.println("Jumping with 2 legs");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void uyu() {
        // TODO Auto-generated method stub

    }

}
