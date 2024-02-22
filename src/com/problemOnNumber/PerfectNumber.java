package com.problemOnNumber;
/*
    Title: Write the Progrom to check the whether Number is Perfect or Not.
    Date: 22:02:2024
    Time: 05:00 PM
    Author: Utkarsh Khalkar
 */
public class PerfectNumber {
    public static void main(String[] args) {
        if (isPerfect(10))
        {
            System.out.println("The Given Number is Perfect Number.");
        }else {
            System.out.println("The Given Numbre is Not Perfect Number.");
        }
    }


    public static boolean isPerfect(int n)
    {
        int sum=0;
        int original=n;
        for (int i=1;i<n-1;i++)
        {
            if (n%i==0)
            {
               sum+=i;
            }
        }

        return (sum==original);
    }
}
