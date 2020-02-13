package com.ykb.training.dp.creational.prototype;

public class Customer {

    private String name;
    private String surname;
    private int age;

    private String type;
    private String role;
    private String credential;

    public Customer cloneMe() {
        Customer customer = new Customer();
        customer.setType(this.type);
        customer.setCredential(this.credential);
        customer.setRole(this.role);
        return customer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    public String getCredential() {
        return this.credential;
    }

    public void setCredential(final String credential) {
        this.credential = credential;
    }

}
