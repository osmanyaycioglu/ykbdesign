package com.ykb.training.oo.example;

import java.lang.reflect.Field;
import java.util.Scanner;

import com.ykb.training.dp.creational.factory.AnimalFactory;

public class AnimalRunner {
    private String name;

    public void animalLife(final IAnimal animal) {
        animal.eat();
        animal.move();
        animal.sound();
        animal.sleep();

    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public static void main(final String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seçiminiz");
        int index = scanner.nextInt();

        IAnimal animal = AnimalFactory.createAnimal(index);

        AnimalRunner animalRunner = new AnimalRunner();
        AnimalRunner animalRunner2 = new AnimalRunner();
        animalRunner2.setName("My first animal runner");
        animalRunner.setName("My first animal runner");
        System.out.println(" Desc : " + animalRunner);
        animalRunner.animalLife(animal);
        if (animalRunner.equals(animalRunner2)) {
            System.out.println("eşit");
        }

        Class<AnimalRunner> ac = AnimalRunner.class;
        AnimalRunner animalRunner3 = ac.newInstance();
        Field[] declaredFields = ac.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }

    @Override
    public String toString() {
        return "AnimalRunner [name=" + this.name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        AnimalRunner other = (AnimalRunner) obj;
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

}
