package com.ykb.training.dp.behavioral.mediator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Mediator {
    private static volatile Mediator instance;
    private Map<String, IFlight> flights = new HashMap<>();

    private Mediator() {
    }

    public static Mediator getInstance() {

        if (Mediator.instance == null) {
            synchronized (Mediator.class) {
                if (Mediator.instance == null) {
                    Mediator.instance = new Mediator();
                }
            }
        }
        return Mediator.instance;
    }

    public void register(final String name, final IFlight flight) {
        this.flights.put(name,
                         flight);
    }

    public boolean sendMessage(final String name, final Message message) {
        IFlight iFlight = this.flights.get(name);
        if (iFlight != null) {
            iFlight.recieveMessage(message);
            return true;
        }
        return false;
    }

    public void sendAll(final Message message) {
        Collection<IFlight> values = this.flights.values();
        for (IFlight iFlight : values) {
            iFlight.recieveMessage(message);
        }
    }

}
