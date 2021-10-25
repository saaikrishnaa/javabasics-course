package com.jsb.javabasics.abstraction;

public interface AutomationInterface {

    //To demonstrate - Interface do not have constructors
//    public AutomationIntreface() {
//    }
//
//    public AutomationIntreface(String clientName, String projectName, Boolean isAutomationFeasible, String[] technologiesUsed, Boolean isCTEnabled) {
//        this.clientName = clientName;
//        this.projectName = projectName;
//        this.isAutomationFeasible = isAutomationFeasible;
//        this.technologiesUsed = technologiesUsed;
//        this.isCTEnabled = isCTEnabled;
//    }

    //Actual Method
//    public String automate(){
//        return "Automation{" +
//                "clientName='" + clientName + '\'' +
//                ", projectName='" + projectName + '\'' +
//                ", isAutomationFeasible=" + isAutomationFeasible +
//                ", technologiesUsed=" + Arrays.toString(technologiesUsed) +
//                ", isCTEnabled=" + isCTEnabled +
//                '}';
//    }

//    public void getClientDetails(){
//        System.out.println("This"+ getClientName()+"is a insurance client's internal project");
//    }
//    public void getProjectDetails(){
//        System.out.println("This"+getProjectName()+"is a agile project with 40 sprints, each sprint having 2 weeks of duration");
//    }

    //Converting the method into Abstract
    public abstract String automate();

    public abstract void getClientDetails();
    public abstract void getProjectDetails();

    public void getInformation();


}
