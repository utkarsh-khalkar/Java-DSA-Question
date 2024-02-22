package com.problemOnNumber;

/*
Title: Write  the Java Program which check the given number is Armstrong or Not
Date: 22-02-2024
Time: 4:48 PM
Author: Utkarsh Khalkar
 */
public class ArmstrongNumber {
    public static void main(String[] args) {

        if (isArmstrong(170))
        {
            System.out.println(" The Given Number is Armstrong Number.");
        }else {
            System.out.println("The Given Number is Not Armstrong.");
        }
    }
    public static boolean isArmstrong(int n)
    {
        int original=n;
        int rev=0;
        int temp=n;
        int cnt=0;
        while (temp!=0)
        {
            cnt++;
            temp/=10;
        }
        while (n!=0)
        {
            int rem=n%10;
            rev+=Math.pow(rem,cnt);
            n/=10;
        }
        return (original==rev);
    }
}
