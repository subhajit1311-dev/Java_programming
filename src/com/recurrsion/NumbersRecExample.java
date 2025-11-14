package com.recurrsion;

public class NumbersRecExample {
    public static void main(String[] args) {
        //recursion->when a function is calling itself it is called recursion
        // Base condition : It is a condition where recursion will stop making new calls
        print(1);
    }
    static void print(int n)
    {
        if(n==5)
        {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive calls
        //if you are calling a function again and again ,you can treat it as a separate call in the stack
        //functions call will keep happening ,stack will be filled again and again
        //that's memory of computer exceeds why stack overflow occurs
        print(n+1);
    }
}
