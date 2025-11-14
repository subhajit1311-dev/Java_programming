package com.sorting;

//import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,1,5,1,4,2};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void bubbleSort(int[] arr)
    {
        boolean swap;
        for(int i=0;i< arr.length;i++)
        {
            swap=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(swap == false){
                break;
            }

        }

    }
}
