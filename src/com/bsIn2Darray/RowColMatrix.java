package com.bsIn2Darray;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};
        int target = 37;
        int[] res = search(arr,target);
        System.out.println(Arrays.toString(res));
    }
    static int[] search(int[][] matrix,int target)
    {
        int[] ans = {-1,-1};
        int r=0;
        int c= matrix.length-1;
        while(r< matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
            else if(matrix[r][c]>target)
            {
                c--;
            }
            else {
                r++;
            }
        }
        return ans;

    }
}
