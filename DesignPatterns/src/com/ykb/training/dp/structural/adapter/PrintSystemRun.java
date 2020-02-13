package com.ykb.training.dp.structural.adapter;

import com.ykb.training.dp.common.printsystem.Employee;
import com.ykb.training.dp.common.printsystem.Person;
import com.ykb.training.dp.common.printsystem.PrintSystem;

public class PrintSystemRun {
    public static void main(final String[] args) {
        Employee employee = new Employee();
        employee.setName("osman");
        employee.setSurname("yaycioglu");
        PrintSystem printSystem = new PrintSystem();
        printSystem.print(employee);

        Person person = new Person();
        person.setIsim("mehmet");
        person.setSoyisim("kul");

        PersonEmployeeAdapter adapter = new PersonEmployeeAdapter(person);
        printSystem.print(adapter);

    }
}
