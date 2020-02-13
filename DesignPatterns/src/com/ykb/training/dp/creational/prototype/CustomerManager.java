package com.ykb.training.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    private Map<String, Customer> customerTypeMap = new HashMap<>();

    public Customer getCustomer(final String customerType) {
        Customer customer = this.customerTypeMap.get(customerType);
        if (customer != null) {
            return customer.cloneMe();
        }
        // Customer ı doldur
        customer = new Customer();
        // WS doldur
        switch (customerType) {
        case "Customer1":
            customer.setType("Customer1");
            customer.setRole("CustomerRole1");
            customer.setCredential("xyz");

            break;
        case "Customer2":
            customer.setType("Customer2");
            customer.setRole("CustomerRole2");
            customer.setCredential("xyz");

            break;
        case "Customer3":
            customer.setType("Customer3");
            customer.setRole("CustomerRole3");
            customer.setCredential("xyz");

            break;

        default:
            break;
        }
        this.customerTypeMap.put(customerType,
                                 customer);
        return customer;
    }
}
