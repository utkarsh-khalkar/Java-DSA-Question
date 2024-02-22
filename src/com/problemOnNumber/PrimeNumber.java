package com.problemOnNumber;

/*
 Title: Write the Program which find out the Prime Number from the Given Range
 Date:22-02-2024
 Time: 5:00 PM
 Author: Utkarsh Khalkar
 */
public class PrimeNumber {
    public static void main(String[] args) {
//        int n=11;
//        boolean ans=isPrime(n);
//        if ((n != 1 && ans) == true) {
//            System.out.println("Number is Prime.");
//        }else {
//            System.out.println("Number is Not Prime.");
//        }
        printPrimeNumberbwrange(1,20);
    }



    // Optimal Solution.
    public  static boolean isPrime(int N)
    {
        if (N==1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Funtion for the find out the prime number from the given range,
    public static void printPrimeNumberbwrange(int x,int y)
    {
        for (int i = x; i <= y; i++) {
            if (isPrime(i))
            {
                System.out.print(" "+ i);
            }
        }
    }
}
