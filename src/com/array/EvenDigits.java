package com.array;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={23,453,677,35,676};
        int ans  = findNumbers(nums);
        System.out.println("The no of even digits in the array: "+ans);
    }
    static int findNumbers(int[] nums){
        int count =0;
        for(int num:nums)
        {
            //System.out.println("the num is :"+num);
            if(even1(num))
            {
                count++;
               // System.out.println("the count is :"+ count);
            }
        }
        return count;
    }
    static boolean even(int num)
    {
        String str = String.valueOf(num);
        System.out.println(str);
        if((str.length()%2)==0)
        {
            return true;
        }
        return false;
    }
    static boolean even1(int num){
        int noOfDigits=0;
        if(num<0){
            num = num*(-1);
        }
        if(num == 0){
            noOfDigits=1;
        }
        //int noOfDigits=0;
        while(num>0){
            noOfDigits++;
            num=num/10;
        }
        if(noOfDigits%2==0){
            return true;
        }
        return false;
    }
}
