package com.ykb.training.dp.structural.adapter;

import com.ykb.training.dp.common.printsystem.Employee;

public class PersonEmployeeGenericAdapter<T extends IAdapt> extends Employee {
    private T person;

    public PersonEmployeeGenericAdapter(final T person) {
        this.person = person;
    }

    @Override
    public String getName() {
        return this.person.getIsim();
    }

    @Override
    public String getSurname() {
        return this.person.getSoyisim();
    }

}
