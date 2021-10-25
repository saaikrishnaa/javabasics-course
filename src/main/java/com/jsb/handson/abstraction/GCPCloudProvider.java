package com.jsb.handson.abstraction;

public interface GCPCloudProvider extends MultiCloudEnvironment {
    String[] getGoogleDataCentreDetails();
    String[] getGCPServiceDetails();
}
