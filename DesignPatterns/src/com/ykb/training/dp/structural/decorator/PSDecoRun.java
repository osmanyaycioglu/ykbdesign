package com.ykb.training.dp.structural.decorator;

import com.ykb.training.dp.common.printsystem.Employee;
import com.ykb.training.dp.common.printsystem.PrintSystem;

public class PSDecoRun {
    public static void main(final String[] args) {
        Employee employee = EmployeeFactory.createEmployee(1);
        employee.setName("osman");
        employee.setSurname("yay");
        PrintSystem printSystem = new PrintSystem();
        printSystem.print(employee);
    }
}
