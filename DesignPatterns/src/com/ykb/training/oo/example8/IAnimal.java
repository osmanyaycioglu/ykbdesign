package com.ykb.training.oo.example8;

@FunctionalInterface
public interface IAnimal {

    void sound(String str);

    default void eat() {
        System.out.println("I am eating");
    }

    default void move() {
        System.out.println("I am moving");
    }

    default void sleep() {
        System.out.println("I am sleeping");
    }

    public static void test() {
        System.out.println("test");
    }
}
