package com.jsb.javabasics.inheritance;

public class StudentType {

    int id;
    String name;
    String department;
    String examDate;

    //To demonstrate this()
    public StudentType() {
//        System.out.println("Java compiler is calling me");
        this(200,"default name","default department");
        // To demonstrate this() should be used only once in a constructor
//        this(344);
    }

    //To demonstrate this()
    StudentType(int id) {
        this();
        this.id = id;
        //To demonstrate this. - a reference variable represents the current object
//        this.
        System.out.println("The paramterized constructor has been accessed, and the student object is construced, and initialized with id - " + id);
    }

    public StudentType(int id, String studentName) {
        this.id = id;
        name = studentName;
        System.out.println("The paramterized constructor has been accessed, and the student object is construced, and initialized with id - " + id + ", and name - " + name);
    }

    public StudentType(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // To demonstrate that as per the business need, I can initialize the object with parameterized constructor
    public StudentType(int id, String name, String department, String currentYearExamDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        examDate = currentYearExamDate;
    }

    void getId() {
        System.out.println(id);
    }

    void getName() {
        System.out.println(name);
    }

    void getDepartment() {
        System.out.println(department);
    }

    void getExamDate() {
        System.out.println("The exam date for the student is -" + examDate);
    }

    // To demonstrate inheritance, as this method is common to both the sub classes
    void calculateStudentCourseFee() {
        // To demonstrate the local variables will not be initialized by constructor
        int courseFee = 0;
        int basicFee = 10000;
        int tutionFee = 4500;
        int convenieneceFee = 2000;
        int computerLabFee = 5000;
        if (department.equalsIgnoreCase("computers")) {
            courseFee = basicFee + tutionFee + convenieneceFee + computerLabFee;
        } else {
            computerLabFee = 0;
            courseFee = basicFee + tutionFee + convenieneceFee + computerLabFee;
        }
        System.out.println("Student with id - " + id + ", has a course fee to pay for amount - " + courseFee);
    }

    // To demonstrate inheritance, as this is method is specific to one class
    //To demonstrate final
      void getComputerLabDetails(){
        if(department.equalsIgnoreCase("computers")) {
            System.out.println("Computer lab is open for hands on practice from 17:30 to 19:30 on TUESDAY, THUSDAY and FRIDAY");
        }
    }
//
//    // To demonstrate inheritance, as this is method is specific to another class
//    void getMathsTestDetails(){
//        System.out.println("Mathematics  exam will be on third week of every month");
//    }



}
