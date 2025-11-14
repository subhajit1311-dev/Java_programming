package com.string;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
        //String str="college wallah";
        //System.out.println(str);

//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        String s1= sc.nextLine();
//        System.out.println(s);
//        System.out.println(s1);

        //String str = "Hello world";
        //int len = str.length();
        //System.out.println(len); //space is also a character
        //char ch = str.charAt(3);
        //System.out.println(ch);

        //System.out.println(str.indexOf('o'));

        //String gtr = "Dello world";
        //System.out.println(str.compareTo(gtr));//gtr<str lexicographically greater (+ve)

        String str="physics wallah";
        //System.out.println(str.contains("wal"));
        //System.out.println(str.startsWith("ph"));
        //System.out.println(str.endsWith("llah"));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String s1= "abc";
        String s2="def";
        System.out.println( s1.concat(s2));


    }
}
