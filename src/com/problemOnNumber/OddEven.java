package com.problemOnNumber;

public class OddEven {
    public static void main(String[] args) {
        isOddEven(9);
    }
    public static void isOddEven(int n)
    {
        if ((n & 1) == 1) {
            System.out.println("The Given Number is Odd.");
        }else {
            System.out.println("The Given Number is Even.");
        }
    }
}
