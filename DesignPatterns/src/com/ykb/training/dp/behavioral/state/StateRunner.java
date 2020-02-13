package com.ykb.training.dp.behavioral.state;

public class StateRunner {
    public static void main(final String[] args) {
        StateMachine machine = new StateMachine();
        machine.git();
        System.out.println(machine);
        machine.dur();
        System.out.println(machine);
        machine.kapat();
        System.out.println(machine);
    }
}
