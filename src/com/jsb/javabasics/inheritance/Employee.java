package com.jsb.javabasics.inheritance;

//This example is to demonstrate when Inheritance is NOT to be used
public class Employee extends StudentType {

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void getEmployeeProjectCode() {
        // business implementation, but for simplicity
        System.out.println("Employee belongs to INS354BLR project code");

    }
}
