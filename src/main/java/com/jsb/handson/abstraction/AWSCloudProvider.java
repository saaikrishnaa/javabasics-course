package com.jsb.handson.abstraction;

public interface AWSCloudProvider extends MultiCloudEnvironment {
    String[] getAWSServicesList();
}
