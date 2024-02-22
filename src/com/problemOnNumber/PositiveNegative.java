package com.problemOnNumber;

public class PositiveNegative {
    public static void main(String[] args) {
        isPositive(11);

    }

    public static void isPositive(int n) {
        if (n >0) {
            System.out.println("The Given Number is Positive.");
        }else {
            System.out.println("The Given Number is Negative.");
        }
    }
}
