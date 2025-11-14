package com.string;

public class Comparison {
    public static void main(String[] args) {
        String name1=new String("subhajit");
        String name2= new String("subhajit");
        System.out.println(name1==name2);//false because the both ref variable not pointing to the same objects
        System.out.println(name1.equals(name2));//true

    }
}
