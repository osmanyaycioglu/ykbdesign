package com.ykb.training.dp.behavioral.mediator;

public class ThirdFlight implements IFlight {
    public ThirdFlight() {
        Mediator.getInstance()
                .register("third",
                          this);
    }

    @Override
    public void recieveMessage(final Message msg) {
        System.out.println("ThirdFlight : " + msg.getMessage());

    }

}
