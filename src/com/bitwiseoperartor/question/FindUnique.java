package com.bitwiseoperartor.question;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,4,6,2,4,6,9,10,9};
        System.out.println(" Unique No Number From the Array is:"+ans(arr));
    }
    private static int ans(int[] arr)
    {
        int unique=0;
        for (int n:arr)
        {
            unique ^=n;
        }
        return unique;
    }
}
