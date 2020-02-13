package com.ykb.training.dp.behavioral.mediator;

public class SecondFlight implements IFlight {

    public SecondFlight() {
        Mediator.getInstance()
                .register("second",
                          this);

    }

    @Override
    public void recieveMessage(final Message msg) {
        System.out.println("SecondFlight : " + msg.getMessage());

    }

}
