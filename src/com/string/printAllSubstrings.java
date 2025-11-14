package com.string;
import java.util.*;
public class printAllSubstrings {
    public static void main(String[] args) {
        String str = "abcd";
        for(int i=0;i<=3;i++)
        {
            for(int j=i+1;j<=4;j++)
            {
                System.out.print(str.substring(i,j)+" ");
            }
        }
        //interning is used for save space
        //new keyword use kore interning ke avoid kora jai
        //String x = new String("hello")
    }
}
