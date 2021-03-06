package com.ykb.training.dp.structural.decorator;

import com.ykb.training.dp.common.printsystem.Employee;

public class EmployeeNameSayinDecorator extends Employee {

    private Employee emp;

    public EmployeeNameSayinDecorator(final Employee emp) {
        this.emp = emp;
    }

    @Override
    public String getName() {
        return "Sayın " + this.emp.getName();
    }

    @Override
    public void setName(final String name) {
        this.emp.setName(name);
    }

    @Override
    public String getSurname() {
        return this.emp.getSurname();
    }

    @Override
    public void setSurname(final String surname) {
        this.emp.setSurname(surname);
    }
}
