package com.kunal;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums= {3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        //string is immutable but the array is mutable
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
