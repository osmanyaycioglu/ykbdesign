package com.ykb.training.dp.behavioral.memento;

public class MyObject {
    private String data1;
    private String data2;
    private String data3;
    private String data4;

    private String data5;
    private String data6;

    public String getData1() {
        return this.data1;
    }

    public String getData2() {
        return this.data2;
    }

    public void setData2(final String data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return this.data3;
    }

    public void setData3(final String data3) {
        this.data3 = data3;
    }

    public String getData4() {
        return this.data4;
    }

    public void setData4(final String data4) {
        this.data4 = data4;
    }

    public String getData5() {
        return this.data5;
    }

    public void setData5(final String data5) {
        this.data5 = data5;
    }

    public String getData6() {
        return this.data6;
    }

    public void setData6(final String data6) {
        this.data6 = data6;
    }

    public static class Memento {
        private MyObject mo;

        public Memento(final MyObject mo) {
            super();
            this.mo = new MyObject();
            this.mo.data1 = mo.data1;
            this.mo.data2 = mo.data2;
            this.mo.data3 = mo.data3;
            this.mo.data4 = mo.data4;

        }

        public MyObject getMo() {
            return this.mo;
        }

        public void returnToThisPoint(final MyObject myo) {
            myo.data1 = this.mo.data1;
            myo.data2 = this.mo.data2;
            myo.data3 = this.mo.data3;
            myo.data4 = this.mo.data4;
        }

    }

    @Override
    public String toString() {
        return "MyObject [data1=" + this.data1 + ", data2=" + this.data2 + ", data3=" + this.data3 + ", data4="
                + this.data4 + ", data5=" + this.data5 + ", data6=" + this.data6 + "]";
    }

}
