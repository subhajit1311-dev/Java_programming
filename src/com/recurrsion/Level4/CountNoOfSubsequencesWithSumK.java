package com.recurrsion.Level4;

import java.util.ArrayList;

public class CountNoOfSubsequencesWithSumK {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int n = 3;
        int s=2;
        int sum = 0;
       int res = countNoOfSubsequencesWithSumK(arr,0,s,sum,n);
        System.out.println(res);
    }
    static int countNoOfSubsequencesWithSumK(int[] arr,int index,int s,int sum,int n)
    {
        if(index==n)
        {
            if(s==sum) return 1;
            else return 0;
        }
        sum+=arr[index];
        int l = countNoOfSubsequencesWithSumK(arr,index+1,s,sum,n);
        sum-=arr[index];
        int r = countNoOfSubsequencesWithSumK(arr,index+1,s,sum,n);
        return l+r;

    }
}
