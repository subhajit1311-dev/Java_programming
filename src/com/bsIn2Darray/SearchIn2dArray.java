package com.bsIn2Darray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr={
                {18,9,12},
                {36,-4,91},
                {44,33,16}
        };
        int target = 91;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[][] arr,int target){
        int[] ans={-1,-1};
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    return new int[]{row,col};
                }

            }
        }
        return ans; //the worst time complexity is o(N^2)
    }

}
