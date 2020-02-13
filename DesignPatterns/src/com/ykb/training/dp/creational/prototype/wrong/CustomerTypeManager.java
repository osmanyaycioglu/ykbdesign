package com.ykb.training.dp.creational.prototype.wrong;

import java.util.HashMap;
import java.util.Map;

public class CustomerTypeManager {
    private Map<String, CustomerType> custTypeMap = new HashMap<>();

    public CustomerTypeManager() {
        // WS den hepsini al ve doldur
        CustomerType customerType = new CustomerType();
        customerType.setType("Customer1");
        customerType.setRole("Role1");
        customerType.setCredential("xyz");
        this.custTypeMap.put("Customer1",
                             customerType);
    }

    public CustomerType getCustomerType(final String custTypeName) {
        return this.custTypeMap.get(custTypeName);

    }
}
