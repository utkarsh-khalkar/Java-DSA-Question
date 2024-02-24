package com.problemOnNumber;
/*
Problem Statement: Given a number N, print the smallest and largest digits present in the number.
Date: 24-02:2024
Time: 10:30
Author: Utkarsh Khalkar
 */
public class MinMaxNo {
    public static void main(String[] args) {
        minMax(-1-1);
    }
    public static void minMax(int n)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while (n != 0) {
            int d=n%10;
            min=Math.min(d,min);
            max=Math.max(d,max);
            n/=10;
        }
        System.out.println("Maximum No is:"+max+"\nMinimum Number is:"+min);
    }
}
