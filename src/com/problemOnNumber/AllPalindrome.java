package com.problemOnNumber;

import java.util.ArrayList;
import java.util.Arrays;
/*
     Title: Write the Program in Java Which finds the All the Palindrome Number from the given Range.
     Date: 20-02-2024
     Time: 11:40 PM
     Author: Utkarsh Khalkar.
 */
public class AllPalindrome {
    public static void main(String[] args) {

        reverse(10,20);
    }

    public static void reverse(int min,int max)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=min;i<=max;i++)
        {
           if (isPalindrome(i))
           {
               list.add(i);
           }
        }
        for (int x:list)
        {
            System.out.println(x);
        }
    }
    public static boolean isPalindrome(int x)
    {
        int original=x;
        int rev=0;
        while (x !=0)
        {
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }

        return original==rev;
    }
}
