package com.ykb.training.oo.example;

public class Lion extends CatFamily {

    @Override
    public void sound() {
        System.out.println("Rooorrrr");
    }

    @Override
    String getName() {
        return "Aslan";
    }

}
