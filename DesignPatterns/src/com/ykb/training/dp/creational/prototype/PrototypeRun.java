package com.ykb.training.dp.creational.prototype;

public class PrototypeRun {
    public static void main(final String[] args) {
        CustomerManager customerManager = new CustomerManager();
        Customer customer = customerManager.getCustomer("Customer1");
        // kullanım 1
        Customer customer2 = customerManager.getCustomer("Customer1");
    }
}
