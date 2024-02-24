package com.problemOnNumber;

public class FibonaccieSeries {
    /*
    Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.
    Date: 24-02-2024
    Time: 11:30
    Author: Utkarsh Khalkar
     */
    public static void main(String[] args) {
        fiboNaccie(6);
    }

    public static void fiboNaccie(int n)
    {
        int[] fib=new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for (int i = 2; i <= n; i++) {
            fib[i]=fib[i-1]+fib[i-2];
        }
        for (int x : fib) {
            System.out.print(" "+x);
        }
    }
}
