package com.array;

public class MaxWealth {
    public static void main(String[] args) {

    }
    static int maximumWealth(int[][] accounts){

        int maxVal=Integer.MIN_VALUE;
        for(int person=0;person < accounts.length;person++){
            int sum=0;
            for(int acc=0;acc<accounts[person].length;acc++)
            {
                sum = sum+accounts[person][acc];
            }
            if(sum>maxVal){
                maxVal=sum;
            }

        }
        return maxVal;

    }
}
