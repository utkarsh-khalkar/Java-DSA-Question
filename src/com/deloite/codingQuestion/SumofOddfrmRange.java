package com.deloite.codingQuestion;

public class SumofOddfrmRange {
    public static void main(String[] args) {

        System.out.println("Sum of Odd From 1 to 9 are:"+oddNoSum(5,10));
    }
    public static int oddNoSum(int a, int b)
    {
        int sum=0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum+=i;
            }
        }
        return sum;
    }
}
