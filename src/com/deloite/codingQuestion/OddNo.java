package com.deloite.codingQuestion;
/*
    Write the Program in java which Print the First Five Odd Number's From the Array..
    N as Input..*/

public class OddNo {
    public static void main(String[] args) {
        oddNo(10);
        System.out.println();
        oddNo1(10);
    }

    public static void oddNo(int n) {

        for (int i = 1; i <= n+(n-1); i++) {
            if (i % 2 != 0) {
                System.out.print(" "+i);
            }
        }
    }
    public static void oddNo1(int n) {

        int i=1;
        while (n-- != 0) {
            System.out.print(" "+i);
            i+=2;
        }
    }
}
