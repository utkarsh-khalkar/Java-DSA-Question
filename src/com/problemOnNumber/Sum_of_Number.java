package com.problemOnNumber;

public class Sum_of_Number {
    public static void main(String[] args) {

        System.out.println("Sum of N Natural Number:"+sumOfNNumber(5));
    }
    public static int sumOfNNumber(int n)
    {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}
