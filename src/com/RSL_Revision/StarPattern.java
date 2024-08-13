package com.RSL_Revision;

public class StarPattern {
    public static void triPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 1 ; j--)
                System.out.print(" ");
            for (int j=0;j<=i;j++)
                System.out.print(" *");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        triPattern(5);
    }
}
