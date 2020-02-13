package com.ykb.training.dp.structural.proxy;

import com.ykb.training.dp.common.printsystem.Employee;

public class EmployeeProxy extends Employee {

    @Override
    public String getName() {
        return "Sayin " + super.getName();
    }
}
