package com.jsb.handson.inheritance;

public class MAStudent extends StudentType {

    public MAStudent(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // To demonstrate com.jsb.handson.inheritance, as this is method is specific to another class
    void getMathsTestDetails() {
        System.out.println("Mathematics exam will be on third week of every month");
    }
}
