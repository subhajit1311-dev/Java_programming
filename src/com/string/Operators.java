package com.string;

import java.util.*;
//import java.lang.Integer;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("A"+"b"+"c");
        System.out.println((char)('a'+3));
        //---important
        System.out.println("a"+1);
        //this is same as after a few steps "a+"1"
        //integer will be converted into Integer(wrapper class) that will call toString()
        System.out.println("kunal"+new ArrayList<>());
        //System.out.println("kunal"+new Integer(56));
        //java operator overloading allow kore na
    }
}
