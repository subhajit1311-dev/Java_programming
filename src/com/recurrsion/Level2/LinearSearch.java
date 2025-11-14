package com.recurrsion.Level2;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,9,2,1,18,9};
        int target = 8;
        if(linearSearch(arr,target,0))
        {
            System.out.println("The element is present in the array");
        }
        else {
            System.out.println("The element is not present in the array");
        }
//        findAllIndex(arr,9,0);
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex1(arr,9,0,list);
//        System.out.println(ans);
//        System.out.println(list);
       ArrayList<Integer> ans = findAllIndex2(arr,9,0);
        System.out.println(ans);
    }
    static boolean linearSearch(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        if(arr[index]==target || linearSearch(arr,target,index+1))
        {
            return true;
        }
        return false;
    }

    static int findIndex(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }
    }
    //static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int[] arr,int target,int index)
//    {
//        if(index==arr.length)
//        {
//            return;
//        }
//        if(arr[index]==target)
//        {
//            list.add(index);
//        }
//         findAllIndex(arr,target,index+1);
//    }
    static ArrayList<Integer> findAllIndex1(int[] arr,int target,int index,ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findAllIndex1(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer> ansForBelowCalls = findAllIndex2(arr,target,index+1);
        list.addAll(ansForBelowCalls);
        return list;
    }
}
