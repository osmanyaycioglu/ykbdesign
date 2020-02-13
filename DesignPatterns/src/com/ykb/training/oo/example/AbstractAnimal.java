package com.ykb.training.oo.example;

public abstract class AbstractAnimal implements IAnimal {

    @Override
    public void sleep() {
        System.out.println("I am sleeping " + this.getName());
    }

    abstract String getName();

    @Override
    public void uyu() {
        this.sleep();
    }

}
