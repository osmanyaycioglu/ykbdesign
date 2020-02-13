package com.ykb.training.dp.structural.adapter;

import com.ykb.training.dp.common.printsystem.Employee;
import com.ykb.training.dp.common.printsystem.Person;

public class PersonEmployeeAdapter extends Employee {
    private Person person;

    public PersonEmployeeAdapter(final Person person) {
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
