package com.operator;

public class FindNonRepeatedEle {
    public static void main(String[] args)
    {
           int[] arr = {2,3,4,3,2,5,4,1,1};
        System.out.println(findNonRepeatedEle(arr));
    }
    static int findNonRepeatedEle(int[] arr)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=(ans^arr[i]);
        }
        if(ans!=0)
        {
            return ans;
        }
        return -1;
    }
}
