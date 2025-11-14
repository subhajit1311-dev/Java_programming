package com.recurrsion.Level3;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
            int[] arr = {5,4,3,2,6,1};
           // arr=mergeSort(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high)
    {
        int n = arr.length;
        int[] temp = new int[n];
        int k=0;
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp[k]=arr[left];
                left++;
                k++;
            }
            else {
                temp[k] = arr[right];
                right++;
                k++;
            }
        }
        while(left<=mid)
        {
            temp[k]=arr[left];
            left++;
            k++;
        }
        while(right<=high)
        {
            temp[k] = arr[right];
            right++;
            k++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp[i-low];
        }
    }
//    static int[] mergeSort(int[] arr)
//    {
//        if(arr.length==1)
//        {
//            return arr;
//        }
//        int mid= arr.length/2;
//        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));//0 to mid-1
//        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));//mid to arr.length-1
//        return merge(left,right);
//    }
//    static int[] merge(int[] first,int[] second)
//    {
//        int[] mix = new int[first.length + second.length];
//        int i=0;
//        int j=0;
//        int k=0;
//        while(i<first.length && j<second.length)
//        {
//            if(first[i]<second[j])
//            {
//                mix[k]=first[i];
//                i++;
//            }
//            else {
//                mix[k]=second[j];
//                j++;
//            }
//            k++;
//        }
//        //it may be possible that one of the arrays is not complete
//        while(i<first.length)
//        {
//            mix[k]=first[i];
//            i++;
//            k++;
//        }
//        while(j<second.length)
//        {
//            mix[k]=second[j];
//            j++;
//            k++;
//        }
//        return mix;
//    }
}
