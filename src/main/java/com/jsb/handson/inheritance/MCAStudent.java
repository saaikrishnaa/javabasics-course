package com.jsb.handson.inheritance;

public class MCAStudent extends StudentType {

    private String semesterName;

    public MCAStudent(int id, String name, String department) {
        //To demonstrate super() method
        super();

        // To demonstrate super keyword
//        super.department = department;
//        super.id=id;
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // To demonstrate com.jsb.handson.inheritance, as this is method is specific to one class
    void getComputerLabDetails() {
        super.calculateStudentCourseFee();
        if (department.equalsIgnoreCase("computers")) {
            System.out.println("Computer lab is open for hands on practice from 17:30 to 19:30 on TUESDAY, THUSDAY and FRIDAY");
        }
    }
}
