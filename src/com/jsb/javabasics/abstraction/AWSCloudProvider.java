package com.jsb.javabasics.abstraction;

public interface AWSCloudProvider extends MultiCloudEnvironment {
    String[] getAWSServicesList();
}
