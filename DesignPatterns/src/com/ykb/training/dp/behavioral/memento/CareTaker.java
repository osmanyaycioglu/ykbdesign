package com.ykb.training.dp.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

import com.ykb.training.dp.behavioral.memento.MyObject.Memento;

public class CareTaker {
    private List<Memento> list = new ArrayList<>();

    public void addMemento(final MyObject mo) {
        Memento memento = new Memento(mo);
        this.list.add(memento);
    }

    public void returnTo(final int index, final MyObject currentMo) {
        Memento memento = this.list.get(index);
        memento.returnToThisPoint(currentMo);
    }
}
