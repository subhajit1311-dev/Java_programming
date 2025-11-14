package com.recurrsion.Level4;

import java.util.ArrayList;

public class PrintSubsequences {
    //a contiguous/non-contiguous sequences which follows order
    //arr[3,1,2] =>{}, 3,1,2,3 1,1 2,3 2,3 1 2
    //a subarray can be a subsequence //3 2 is not a subsequence
    //power set method die solve hoy
    //eta recursive soln.
    public static void main(String[] args) {
        int[] arr= {3,1,2};
         int n = 3;
         ArrayList<Integer> list = new ArrayList<>();
        printSubsequences(arr,0,list,n);
    }
    static void printSubsequences(int[] arr,int index,ArrayList<Integer> list,int n)
    {
        if(index==n)
        {
            if (list.size()==0)
            {
                System.out.println("[]");
            } else {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        printSubsequences(arr,index+1,list,n);
        list.remove(list.size()-1);
        printSubsequences(arr,index+1,list,n);
    }

}
