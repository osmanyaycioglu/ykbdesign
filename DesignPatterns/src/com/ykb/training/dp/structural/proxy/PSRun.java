package com.ykb.training.dp.structural.proxy;

import com.ykb.training.dp.common.printsystem.Employee;
import com.ykb.training.dp.common.printsystem.PrintSystem;

public class PSRun {
    public static void main(final String[] args) {
        Employee employee = new EmployeeProxy();
        employee.setName("osman");
        employee.setSurname("yaycioglu");
        PrintSystem printSystem = new PrintSystem();
        printSystem.print(employee);

    }
}
