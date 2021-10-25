package com.jsb.javabasics.string;

public class StringHandson {

    public static void main(String[] args) {
        final String firstString = "are";
        String secondString = "Hi Hello";

        //Concatenation
        System.out.println("Concatenating strings - "+secondString+" "+firstString);

        //Comparison
        System.out.println("Compare result -"+firstString.equalsIgnoreCase(secondString));

        System.out.println("Length -"+firstString.length());

//        System.out.println(firstString.substring(3,5));

        System.out.println(secondString.contains(firstString));

        System.out.println(firstString.toUpperCase());

        //To demonstrate final variable
//        firstString = "Assigning another value to a final variable is restricted";

        System.out.println(secondString.replace("are","ARE"));

        System.out.println(secondString.charAt(4));

    }
}
