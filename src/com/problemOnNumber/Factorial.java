package com.problemOnNumber;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Factorial of Number:"+fact(5));
    }

    public static int fact(int N) {

        int fact=1;
        for (int i = 1; i <= N; i++) {
            fact*=i;
            System.out.println(fact);
        }
        return fact;
    }
}
