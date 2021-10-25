package com.jsb.handson.abstraction;

public abstract class BigDataAutomation implements main.java.abstraction.AutomationInterface {
    @Override
    public String automate() {
        return "Big Data Automation commonly includes using the below technologies" +
                " - Hadoop" +
                " - or Spark"+
                " - Pig"+
                " - Hive"+
                " - HBase";
    }

    @Override
    public void getClientDetails() {
        System.out.println("Client details for Big Data project");
    }

    @Override
    public void getProjectDetails(){
        System.out.println("Project details for Big Data project");
    }

//    @Override
//    public void getInformation() {
//        System.out.println("get information");
//    }


}
