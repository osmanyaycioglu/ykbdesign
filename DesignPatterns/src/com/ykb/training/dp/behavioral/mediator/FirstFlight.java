package com.ykb.training.dp.behavioral.mediator;

public class FirstFlight implements IFlight {
    public FirstFlight() {
        Mediator.getInstance()
                .register("first",
                          this);
    }

    @Override
    public void recieveMessage(final Message msg) {
        System.out.println("FirstFlight : " + msg.getMessage());
        Message message = new Message();
        message.setMessage("Çarpacağım dön");
        Mediator.getInstance()
                .sendMessage("second",
                             message);
    }

}
