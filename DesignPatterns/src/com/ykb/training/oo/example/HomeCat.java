package com.ykb.training.oo.example;

public class HomeCat extends CatFamily {

    @Override
    public void sound() {
        System.out.println("Miyav miyav");
    }

    @Override
    String getName() {
        return "Kedi";
    }

}
