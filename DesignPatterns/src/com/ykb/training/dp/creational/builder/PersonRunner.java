package com.ykb.training.dp.creational.builder;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = Person.getBuilder()
                              .withSurname("yay")
                              .withName("osman")
                              .withYas(50)
                              .build();
    }
}
