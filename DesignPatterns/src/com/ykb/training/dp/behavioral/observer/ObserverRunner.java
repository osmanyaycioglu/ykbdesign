package com.ykb.training.dp.behavioral.observer;

public class ObserverRunner {
    public static void main(final String[] args) {
        IAlarm createAlarmSystem = AlarmSystemFactory.createAlarmSystem();
        createAlarmSystem.statusChange(EStatus.ALARM_ON);
    }
}
