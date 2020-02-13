package com.ykb.training.dp.behavioral.chainofresponsibility;

import java.util.List;

public class NumberCheck implements INumberCheck {
    private List<INumberCheck> checkList;

    @Override
    public boolean check(final int num) {
        for (INumberCheck iNumberCheck : this.getCheckList()) {
            if (iNumberCheck.check(num)) {
                return true;
            }
        }
        return false;
    }

    public List<INumberCheck> getCheckList() {
        return this.checkList;
    }

    public void setCheckList(final List<INumberCheck> checkList) {
        this.checkList = checkList;
    }

}
