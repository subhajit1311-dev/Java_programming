package com.operator;

public class IsEvenOdd {
    public static void main(String[] args) {
        int n=6;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        if((n&1)==1)
        {
            return true;
        }
        return false;
    }
}
