package com.recurrsion.Level1;

public class Palindrome {
    static int sum=0;
    public static void main(String[] args) {
        System.out.println(isPalindrome(54776));
    }
    static boolean isPalindrome(int n){
        if(rev(n)==n){
            return true;
        }
        return false;
    }

    static int rev(int n)
    {
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    public static boolean isPalindrome1(int i, int j, String s) {

        // If pointers have crossed,
        // it's a palindrome
        if (i >= j) {
            return true;
        }

        // If characters at i and j are not the same,
        // return false
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }

        // Recursive call for the
        //next pair of pointers
        return isPalindrome1(i + 1, j - 1, s);
    }

    // Overloaded method to simplify the call
//    public static boolean isPalindrome1(String s) {
//        return isPalindrome1(0, s.length() - 1, s);
//    }

}
