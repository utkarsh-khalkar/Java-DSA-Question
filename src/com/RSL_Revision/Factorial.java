package com.RSL_Revision;

public class Factorial {
    public static int findFactorail(int n)
    {
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {

        System.out.println("Factorial of Number is:"+findFactorail(5));
    }
}
