package com.marcosoft;

public class ObjectComparisonLab {

    public static void main(String[] args) {

        String s1 = "MYSTRING";
        String s2 = "MYSTRING" + "";

        String s3 = new String("MYSTRING");
        String s4 = new String("MYSTRING");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

    }

}
