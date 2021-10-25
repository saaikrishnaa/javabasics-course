package com.jsb.javabasics.abstraction;

public class WebAutomation extends Automation{

    @Override
    public String automate() {
        return "Web Automation commonly includes using the below technologies" +
                " - Selenium" +
                " - Cucumber" +
                " - TestNG" +
                " - Maven" +
                " - Git" +
                " - Application Server or Cloud Platform";
    }

    @Override
    public void getProjectDetails() {
        System.out.println("Web automation project details");
    }
}
