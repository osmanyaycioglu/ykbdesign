package com.ykb.training.dp.creational.factory;

import com.ykb.training.oo.example.Cheetah;
import com.ykb.training.oo.example.HomeCat;
import com.ykb.training.oo.example.IAnimal;
import com.ykb.training.oo.example.Jaguar;
import com.ykb.training.oo.example.Lion;
import com.ykb.training.oo.example.Vasak;

public class AnimalFactory {
    public static IAnimal createAnimal(final int index) {
        IAnimal animal = null;
        switch (index) {
        case 1:
            animal = new Cheetah();
            break;
        case 2:
            animal = new HomeCat();
            break;
        case 3:
            animal = new Lion();
            break;
        case 4:
            animal = new Jaguar();
            break;
        case 5:
            animal = new Vasak();
            break;

        default:
            animal = new Cheetah();
            break;
        }
        return animal;
    }
}
