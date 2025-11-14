package com.cyclicSort;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
    int[] arr={4,0,2,1};
    int ans = missingNum(arr);
        System.out.println(ans);
    }
    static int missingNum(int[] arr){
        int i=0;
        while(i< arr.length)
        {
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
                i++;

        }
        //search first missing number
        for (int index= 0; index < arr.length;index++) {
            if(arr[index]!=index)
            {
                return index;
            }
        }
        //N is not in the array
        return arr.length;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
