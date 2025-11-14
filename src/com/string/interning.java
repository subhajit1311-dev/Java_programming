package com.string;

public class interning {
    public static void main(String[] args) {
        String s= "hello";
        String x="hello";
        x="Mello";
        System.out.println(s+" "+x);
        //why the immutability in strings occur
        //interning avoid korar jonno jate security maintain hoy system e
        //poor performance of the string-> immutability

    }
}
