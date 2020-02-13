package com.ykb.training.dp.behavioral.mediator;

public class MediatorRun {
    public static void main(final String[] args) {
        Mediator instance = Mediator.getInstance();
        new FirstFlight();
        new SecondFlight();
        new ThirdFlight();
        Message message = new Message();
        message.setMessage("alçalın");

        instance.sendAll(message);

    }
}
