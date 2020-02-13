package com.ykb.training.oo.example8;

public class AnRunner {
    public static void main(final String[] args) {
//        IAnimal a = new IAnimal() {
//            @Override
//            public void sound() {
//                System.out.println("Test");
//            }
//        };
        AnRunner anRunner = new AnRunner();
        anRunner.animalLife((a) -> {
            System.out.println("Test " + a);
        });

        anRunner.animalLife((a) -> System.out.println("Miyav " + a));

        anRunner.animalLife((a) -> System.out.println("Havhav " + a));

    }

    public void animalLife(final IAnimal animal) {
        animal.eat();
        animal.move();
        animal.sound(" my sound");
        animal.sleep();
    }
}
