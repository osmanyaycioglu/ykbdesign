package com.ykb.training.dp.structural.decorator;

import com.ykb.training.dp.common.printsystem.Employee;

public class EmployeeFactory {
    public static Employee createEmployee(final int index) {
        int shiftIndex = index;
        Employee employee = new Employee();
        int sonuc = shiftIndex;
        for (int i = 0; i < 4; i++) {
            if ((sonuc & 1) == 1) {
                switch (i) {
                case 0:
                    employee = new EmployeeNameMrDecorator(employee);
                    break;
                case 1:
                    employee = new EmployeeNameSayinDecorator(employee);
                    break;
                case 2:
                    employee = new EmployeeSurnameHazretleriDecorator(employee);
                    break;
                case 3:
                    employee = new EmployeeSurnameUnlemDecorator(employee);
                    break;
                default:
                    break;
                }
            }
            sonuc = shiftIndex >> 1;
        }
        return employee;
    }
}
