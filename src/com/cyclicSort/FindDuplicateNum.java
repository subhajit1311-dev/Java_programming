package com.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNum {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                int temp = arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else {
                i++;
            }
        }

        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                return arr[index];
            }
        }
        return -1;
    }
}
