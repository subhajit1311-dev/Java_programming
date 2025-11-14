package com.bsIn2Darray;
import java.util.Scanner;
public class SearchIn2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number no of rows");
        int row = in.nextInt();
        System.out.println("Enter the numbers of col");
        int col = in.nextInt();

        //initialization of the matrix
       int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the target");
        int target = in.nextInt();

        if(searchIn2dArr1(matrix,row,col,target))
        {
            System.out.println("Element is in the matrix");
        }
        else {
            System.out.println("Element is not in the array");
        }

        //print the index of that search element
//        int[] arr = searchIn2dArr(matrix,row,col,target);
//        for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i]);
//        }
    }
    static int[] searchIn2dArr(int[][] matrix,int row,int col,int target)
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static boolean searchIn2dArr1(int[][] matrix,int row,int col,int target)
    {
        for (int i = 0; i < row ; i++) {
            if(matrix[i][0]<=target && target<=matrix[i][col])
            {
                return bs(matrix[i],target);
            }
        } //tc=>o(n)+o(log m)
        return false;
    }
    static boolean bs(int[] matrix,int target)
    {
        int low=0;
        int high = matrix.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(matrix[mid]==target)
            {
                return true;
            }
            else if(matrix[mid]<target)
            {
                low=mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return false;
    }
}
