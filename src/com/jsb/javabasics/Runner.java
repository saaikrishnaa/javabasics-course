package com.jsb.javabasics;

import com.jsb.javabasics.abstraction.*;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
//        StudentType first = new StudentType();
//        Student first = new Student(101,"First Student","Computers");
//        first.id = 101;
//        first.name = "First Student";
//        first.department = "Computers";
//
//        first.getStudentName();
//        first.getStudentId();
//        first.getStudentDepartment();
//        first.calculateStudentCourseFee();

////        Student second = new Student();
//        Student second = new Student(102, "Second Student","Maths");
////        second.id = 102;
////        second.name = "Second Student";
////        second.department = "Maths";
//        second.getStudentName();
//        second.getStudentId();
//        second.getStudentDepartment();

//        Student s1 = new Student(10);
//        s1.getStudentId();


//        //Discuss about Inheritance - Problem 1
//        StudentType computerStudent = new StudentType(102, "S102","computers");
//        computerStudent.calculateStudentCourseFee();
//        computerStudent.getComputerLabDetails();
//        computerStudent.getMathsTestDetails(); // ISSUE - Not proper as computer student don't write maths test
//
//        System.out.println("================================");
//
//        StudentType mathsStudent = new StudentType(103,"Harsha","MA-Science","20-Dec-2021");
//        mathsStudent.getId();
//        mathsStudent.getName();
//        mathsStudent.getExamDate();
//        mathsStudent.getComputerLabDetails(); // ISSUE - Not proper as a maths student don't have computer lab

//        System.out.println("============================================================================");
//
//         //To rectify the above issue, The below approach is being followed, by creating distinct classes
//        //Discuss about Inheritance - Problem 2 - We have solved the above issue, then what's wrong in the approach?
//        //ISSUE - Repetetion of code, No Code Reuse, then what's the solution? - using INHERITANCE
//        MCAStudent mcaStudent = new MCAStudent(11231,"Student1","Computers");
//        mcaStudent.getId();
//        mcaStudent.getName();
//        mcaStudent.calculateStudentCourseFee();
//        mcaStudent.getComputerLabDetails();
//
//        System.out.println("================================");
//
//        MAStudent maStudent = new MAStudent(43422,"Student2","Mathematics");
//        maStudent.getId();
//        maStudent.getName();
//        maStudent.calculateStudentCourseFee();
//        maStudent.getMathsTestDetails();

//        System.out.println("============================================================================");
//
//        MCAStudent student1 = new MCAStudent(11231, "Student1", "Computers");
//        student1.getId();
//        student1.getName();
//        student1.calculateStudentCourseFee();
//        student1.getComputerLabDetails();
//
//        System.out.println("================================");
//
//        MAStudent student2 = new MAStudent(43422, "Student2", "Mathematics");
//        student2.getId();
//        student2.getName();
//        student2.calculateStudentCourseFee();
//        student2.getMathsTestDetails();

//        System.out.println("============================================================================");
//
//        //When NOT to go for inheritance
//        Employee employee = new Employee(5235, "Employee1", "Computers");
//        employee.getId();
//        employee.getName();
//        employee.getDepartment();
//        employee.getEmployeeProjectCode();

//        System.out.println("============================================================================");
//        UnderstandEncapsulation encapsulatedObject = new UnderstandEncapsulation();
//        encapsulatedObject.setId(-235);
//        encapsulatedObject.setName("Person1");
//        encapsulatedObject.displayValues();

//        System.out.println("============================================================================");
//        ReadOnlyEncapsulatedEntity readOnly = new ReadOnlyEncapsulatedEntity();
//        readOnly.displayValues();

//        System.out.println("============================================================================");
//        WriteOnlyEncapsulatedEntity writeOnly = new WriteOnlyEncapsulatedEntity();
//        writeOnly.setCollegeId(423523);
//        writeOnly.setCollegeName("New College");
//        writeOnly.displayValues();

//        System.out.println("============================================================================");
//
//        AffiliatedColleges siddharthaCollege = new AffiliatedColleges("Siddhartha College", 232351, true, "Acharya Nagarjuna University");
//        System.out.println(siddharthaCollege.toString());
//
//        AffiliatedColleges klceCollege = new AffiliatedColleges("K.L.C.E College", 874556, true, "Acharya Nagarjuna University");
//        System.out.println(klceCollege.toString());
//
//        AffiliatedColleges bapatlaEngineeringCollege = new AffiliatedColleges("Bapatla Engineering College", 123323, true, "Acharya Nagarjuna University");
//        System.out.println(bapatlaEngineeringCollege.toString());
//
//        AffiliatedColleges newCollege = new AffiliatedColleges("Recently Established College", 989898, false, "Acharya Nagarjuna University");
//        System.out.println(newCollege.toString());
//
//        AffiliatedColleges gokulCollege = new AffiliatedColleges("Gokul Engineering College", 52523, true, "JNTU");
//        System.out.println(gokulCollege.toString());

//        System.out.println("============================================================================");
//
//        AffiliatedCollegesUsingStatic siddharthaCollegeUsingStatic = new AffiliatedCollegesUsingStatic("Siddhartha College", 232351, true);
//        System.out.println(siddharthaCollegeUsingStatic.toString());
//
//        AffiliatedCollegesUsingStatic klceCollegeUsingStatic = new AffiliatedCollegesUsingStatic("K.L.C.E College", 874556, true);
//        System.out.println(klceCollegeUsingStatic.toString());
//
//        AffiliatedCollegesUsingStatic bapatlaEngineeringCollegeUsingStatic = new AffiliatedCollegesUsingStatic("Bapatla Engineering College", 123323, true);
//        System.out.println(bapatlaEngineeringCollegeUsingStatic.toString());
//
//        AffiliatedCollegesUsingStatic newCollegeUsingStatic = new AffiliatedCollegesUsingStatic("Recently Established College", 989898, false);
//        System.out.println(newCollegeUsingStatic.toString());

//        System.out.println("============================================================================");
//
//
//        StaticBlock staticBlock = new StaticBlock();
//        staticBlock.otherMethod();
//        StaticBlock.staticMethod();

//        System.out.println("============================================================================");
//        UnderstandMethodOverloading methodOverloading = new UnderstandMethodOverloading(); //NOT REQUIRED - as the methods are static
//        UnderstandMethodOverloading.calculateStudentCourseFee("C5232","Computers");
//        UnderstandMethodOverloading.calculateStudentCourseFee("M5423","Mathematics");
//        UnderstandMethodOverloading.getStudentDetails("P1412", "New Student", "Physics");
//        String studentDetails = UnderstandMethodOverloading.getStudentDetails("C5253","Computers");
//        System.out.println(studentDetails);

//        System.out.println("============================================================================");
//        String[] technologiesUsed = {"Selenium","Cucumber","TestNG","Maven","Jenkins","Google Cloud Platform","Jenkins","Git"};
//        Automation automation = new Automation("Insurance Client","Project1", true,technologiesUsed, true);
//        System.out.println(automation.automate());

        //Way 1
//        Automation automation = new Automation() {
//            @Override
//            public String automate() {
//                return "I am automating";
//            }
//        };
//        System.out.println(automation.automate());

        //Way 2
//        Automation automation = new WebAutomation();
//        System.out.println(automation.automate());
//        automation.getProjectDetails();
//        automation.getCICDDetails();

//        Automation automation = new MobileAutomation();
//        System.out.println(automation.automate());
//        automation.getProjectDetails();
//
//        Automation automation = new RESTAPIAutomation();
//        String value = automation.automate();
//        System.out.println(value);
//        automation.getProjectDetails();

//        Automation automation = new APIAutomation();
//        System.out.println(automation.automate());

//        System.out.println("============================================================================");
//        AutomationInterface automationInterface = new BigDataAutomation();
//        automationInterface.getClientDetails();
//        automationInterface.getProjectDetails();

//        AutomationInterface automationInterface = new BigDataAWSAutomation();
//        automationInterface.getInformation();

        System.out.println("============================================================================");
        COEAutomation coeAutomation = new COEAutomation();

        String automationDetails = coeAutomation.automate();
        System.out.println(automationDetails);

        String[] awsServicesList = coeAutomation.getAWSServicesList();
        System.out.println(Arrays.asList(awsServicesList));

        coeAutomation.getBillingDetails();
        coeAutomation.getCloudProviderDetails();
        coeAutomation.getProjectDetails();

        String[] gcpServices = coeAutomation.getGCPServiceDetails();
        System.out.println(Arrays.asList(gcpServices));

        String[] googleDataCentres = coeAutomation.getGoogleDataCentreDetails();
        System.out.println(Arrays.asList(googleDataCentres));

        coeAutomation.getOnPremiseDetails();
        coeAutomation.getProjectDetails();
        coeAutomation.getLoadBalancerDetails();

    }
}
