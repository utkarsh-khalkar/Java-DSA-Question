package com.problemOnNumber;
/*
 Title: Write the Program which check the Number is Palindrome or Not.
 Date: 20-02-2024
 Time: 10:47
 Author: Utkarsh Khalkar.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(100));
    }

    public static boolean isPalindrome(int no)
    {
        int original=no;
        int rev=0;

        while (no !=0)
        {
            int rem=no%10;
            rev=rev*10+rem;
            no/=10;
        }

        if (original==rev)
        {
            return true;
        }else
        {
            return false;
        }
    }
}
