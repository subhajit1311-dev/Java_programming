package com.recurrsion.Level4;
import java.util.*;
public class PrintSubsequenceWithSumK {
    public static void main(String[] args) {
         int[] arr={1,2,1};
         int n = 3;
         ArrayList<Integer> list = new ArrayList<>();
         int s=2;
         int sum = 0;
         //printSubsequencesWithSumK(arr,0,s,sum,list,n);
        printOneSubsequencesWithK(arr,0,s,sum,list,n);
    }
    static void printSubsequencesWithSumK(int[] arr,int index,int s,int sum,ArrayList<Integer> list,int n)
    {
        if(index==n)
        {
            if(sum==s)
            {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        sum += arr[index];
        printSubsequencesWithSumK(arr,index+1,s,sum,list,n);
        sum = sum-list.get(list.size()-1);
        list.remove(list.size()-1);
        printSubsequencesWithSumK(arr,index+1,s,sum,list,n);
    }
   static boolean printOneSubsequencesWithK(int[] arr,int index,int s,int sum,ArrayList<Integer> list,int n){
       if(index==n)
       {
           if(sum==s)
           {
               System.out.println(list);
               return true;
           }
           return false;
       }
       list.add(arr[index]);
       sum += arr[index];
       if(printOneSubsequencesWithK(arr,index+1,s,sum,list,n))
       {
           return true;
       }
       sum = sum-list.get(list.size()-1);
       list.remove(list.size()-1);
       if(printOneSubsequencesWithK(arr,index+1,s,sum,list,n))
       {
        return true;
       }
       return false;
   }
}
