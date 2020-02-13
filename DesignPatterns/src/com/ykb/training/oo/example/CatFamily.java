package com.ykb.training.oo.example;

public abstract class CatFamily extends AbstractAnimal {

    @Override
    public void eat() {
        System.out.println("I am eating meat.");
    }

    @Override
    public void move() {
        System.out.println("Move with 4 legs");
    }

}
