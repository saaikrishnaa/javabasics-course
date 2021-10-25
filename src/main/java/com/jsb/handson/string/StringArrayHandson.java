package com.jsb.handson.string;

public class StringArrayHandson {

    public static void main(String[] args) {
       //way -1
        String stringArray[] = {"Hi","How","Are","You","Doing"};

        System.out.println(stringArray.length);
        System.out.println(stringArray[4]);

        System.out.println("======================");
        //way -2
        String[] sizedArray = new String[10];
        System.out.println(sizedArray.length);
        sizedArray[0] = "Hi";
        sizedArray[4] = "Are";
        System.out.println(sizedArray[0]);
    }
}
