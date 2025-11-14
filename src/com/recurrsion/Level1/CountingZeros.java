package com.recurrsion.Level1;

public class CountingZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(1230405));
    }
    static int countZeros(int num)
    {
        return helper(num,0);
    }
    //special pattern,how to pass a value to above calls
    static int helper(int num,int c)
    {
        if(num==0)
            return c;
        int rem = num%10;
        if(rem==0)
        {
            return helper(num/10,c+1);
        }
        return helper(num/10,c);
    }
}
