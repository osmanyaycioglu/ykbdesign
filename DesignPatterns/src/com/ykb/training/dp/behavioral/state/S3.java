package com.ykb.training.dp.behavioral.state;

public class S3 implements IMyState {
    private StateMachine st;

    public S3(final StateMachine st) {
        super();
        this.st = st;
    }

    @Override
    public void git() {
        System.out.println("Gidiyorum");
        this.st.setCurrentState(new S2(this.st));

    }

    @Override
    public void dur() {
        System.out.println("Do nothing");

    }

    @Override
    public void kapat() {
        System.out.println("Kapatıyorum");
        this.st.setCurrentState(new S1(this.st));

    }

    @Override
    public String toString() {
        return "S3";
    }

}
