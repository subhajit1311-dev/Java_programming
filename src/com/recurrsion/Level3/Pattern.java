package com.recurrsion.Level3;

public class Pattern {
    public static void main(String[] args) {
        print1(4,0);
    }
    static void print1(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            print1(r,c+1);
        }
        else {
            System.out.println();
            print1(r-1,c);
        }
    }
}
