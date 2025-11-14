package com.string;
import java.util.*;

public class stringIntChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcd";
//        str=str+"def";
//        str=str+10;
//        str=str+'t';

        //substring => continuous part of the string
       // a,ab,abc,abcd,b,bc,bcd,c,cd,d
        System.out.println(str.substring(0,2));//=>oth to (2-1)st index
        System.out.println(str.substring(3));

    }
}
