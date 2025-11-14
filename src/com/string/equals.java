package com.string;

public class equals {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        //System.out.println(s1==s3);//== address deke
        System.out.println(s1.equals(s3));//address same hole true return kore dei
        // but address same na hole character by character check kore

    }
}
