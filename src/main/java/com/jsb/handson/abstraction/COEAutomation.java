package com.jsb.handson.abstraction;

public class COEAutomation extends Automation implements GCPCloudProvider, AWSCloudProvider, OnPremiseEnvironment{

    @Override
    public String automate() {
        return "Hey, We are automating UI, API, Big Data layers of an application";
    }

    @Override
    public void getProjectDetails() {
        System.out.println("Hey, This project is a internal Centre of Excellence LOB project");
    }

    @Override
    public void getCloudProviderDetails() {
        System.out.println("As of now we are leveraging a multi-cloud environment application development");
    }

    @Override
    public void getBillingDetails() {
        System.out.println("Initial 3 months - FREE, later I will get charged per second basis, depends on the service that I intend to use");
    }

    @Override
    public String[] getAWSServicesList() {
        return new String[]{"Amazon EC2", "AWS Lambda", "S3", "RDS"};
    }

    @Override
    public String[] getGoogleDataCentreDetails() {
        return new String[]{"APAC","US-East", "US-West", "China","Russia", "Europe"};
    }

    @Override
    public String[] getGCPServiceDetails() {
        return new String[]{"App Engine", "Compute Engine", "GKE", "Cloud Source Repositories", "Cloud Build", "Error Reporting", "Logging", "Cloud Function"};
    }

    @Override
    public void getOnPremiseDetails() {
        System.out.println("These are my on premise details - host - http://dev-bank.project.company.com:9879, server details");
    }

    @Override
    public void getProxyDetails() {
        System.out.println("Proxy details");
    }

    @Override
    public void getLoadBalancerDetails() {
        System.out.println("Load Balancer Details - Round Robin Scheduling Load Balancing Implementation");
    }
}
