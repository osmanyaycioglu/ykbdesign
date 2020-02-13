package com.ykb.training.dp.behavioral.observer;

public class Ligths implements IAlarm {

    @Override
    public void statusChange(final EStatus status) {
        switch (status) {
        case ALARM_OFF:
            System.out.println("Do nothing.");
            break;
        case ALARM_ON:
            System.out.println("Turn on lights.");
            break;
        default:
            break;
        }

    }

}
