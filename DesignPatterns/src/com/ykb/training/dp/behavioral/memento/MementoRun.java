package com.ykb.training.dp.behavioral.memento;

public class MementoRun {
    public static void main(final String[] args) {
        MyObject myObject = new MyObject();
        myObject.setData2("D2");
        myObject.setData3("D3");
        myObject.setData4("D4");
        myObject.setData5("D5");
        myObject.setData6("D6");

        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(myObject);
        myObject.setData2("ID2");
        myObject.setData3("ID3");
        myObject.setData4("ID4");
        myObject.setData5("ID5");
        myObject.setData6("ID6");

        System.out.println(myObject);

        careTaker.addMemento(myObject);
        careTaker.returnTo(0,
                           myObject);

        System.out.println(myObject);
    }
}
