package com.ykb.training.dp.creational.prototype.wrong;

import com.ykb.training.dp.creational.prototype.Customer;

public class WrongTurn {
    public static void main(final String[] args) {
        CustomerTypeManager customerTypeManager = new CustomerTypeManager();
        Customer customer = new Customer();
        CustomerType customerType = customerTypeManager.getCustomerType("Customer1");
        customer.setType(customerType.getType());
        customer.setCredential(customerType.getCredential());
        customer.setRole(customerType.getRole());

    }
}
