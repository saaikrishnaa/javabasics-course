package com.jsb.javabasics.abstraction;

public interface GCPCloudProvider extends MultiCloudEnvironment {
    String[] getGoogleDataCentreDetails();
    String[] getGCPServiceDetails();
}
