package com.jsb.javabasics.staticentity;

import java.util.HashMap;
import java.util.Map;

public class StaticBlock {

    static {
        System.out.println("I am static initializer, I will be available even before object creation");
        System.out.println("I can even replace your Constants file, you can have all the constants placed in this block, and I will make sure they are there available even before the object is created");

        Map constantsMap = new HashMap();
        constantsMap.put("applicationUrl","https://orangehrmlive.com");
        constantsMap.put("env","dev");
        constantsMap.put("dbConnectionUrl","mysql db url");

    }

    public StaticBlock() {
        System.out.println("I am constructor");
    }

    public static void staticMethod() {
        System.out.println("I am static method");
    }

}
