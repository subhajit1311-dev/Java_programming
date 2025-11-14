package com.string;

public class performance {
    public static void main(String[] args) {
        String str = "subhajit";
        for (int i = 0; i < str.length(); i++) {
            str += i;
        }
        System.out.println(str);
    }
}
