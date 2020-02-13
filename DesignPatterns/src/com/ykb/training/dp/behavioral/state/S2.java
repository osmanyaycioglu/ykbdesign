package com.ykb.training.dp.behavioral.state;

public class S2 implements IMyState {
    private StateMachine st;

    public S2(final StateMachine st) {
        super();
        this.st = st;
    }

    @Override
    public void git() {
        System.out.println("Do nothing");

    }

    @Override
    public void dur() {
        System.out.println("Duruyorum");
        this.st.setCurrentState(new S3(this.st));

    }

    @Override
    public void kapat() {
        System.out.println("Kapatıyorum");
        this.st.setCurrentState(new S1(this.st));

    }

    @Override
    public String toString() {
        return "S2";
    }

}
