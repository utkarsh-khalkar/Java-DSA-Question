package com.problemOnNumber;
/*
    Problem: Write the Program which revrese the Given Number.
    Date:24-02-2024
    Time:10:00 AM
    Author: Utkarsh Khalkar
 */
public class ReverseNo {
    public static void main(String[] args) {
        System.out.println(reverseNo(1444));
    }

    public static int reverseNo(int n)
    {
        int rev=0;
        while (n != 0) {
            int rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        return rev;
    }
}
