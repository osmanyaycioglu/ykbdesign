package com.ykb.training.dp.behavioral.observer;

public class AlarmSystemFactory {
    public static IAlarm createAlarmSystem() {
        AlarmSystem alarmSystem = new AlarmSystem();
        alarmSystem.observe(new Ligths());
        alarmSystem.observe(new Gate());
        alarmSystem.observe(new Door());
        return alarmSystem;
    }
}
