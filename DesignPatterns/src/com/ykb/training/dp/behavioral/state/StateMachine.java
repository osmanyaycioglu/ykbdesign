package com.ykb.training.dp.behavioral.state;

public class StateMachine implements IMyState {
    private IMyState currentState = new S1(this);

    @Override
    public void git() {
        this.currentState.git();
    }

    @Override
    public void dur() {
        this.currentState.dur();

    }

    @Override
    public void kapat() {
        this.currentState.kapat();
    }

    public IMyState getCurrentState() {
        return this.currentState;
    }

    public void setCurrentState(final IMyState currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return this.currentState.toString();
    }

}
