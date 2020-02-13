package com.ykb.training.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmSystem implements IAlarm {
    private List<IAlarm> alarms = new ArrayList<>();

    public void observe(final IAlarm alarm) {
        this.alarms.add(alarm);
    }

    @Override
    public void statusChange(final EStatus status) {
        for (IAlarm iAlarm : this.alarms) {
            iAlarm.statusChange(status);
        }
    }

}
