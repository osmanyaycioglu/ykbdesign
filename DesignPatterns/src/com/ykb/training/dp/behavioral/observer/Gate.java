package com.ykb.training.dp.behavioral.observer;

public class Gate implements IAlarm {

    @Override
    public void statusChange(final EStatus status) {
        switch (status) {
        case ALARM_OFF:
            System.out.println("Closing gate.");
            break;
        case ALARM_ON:
            System.out.println("Opening gate.");
            break;
        default:
            break;
        }

    }

}
