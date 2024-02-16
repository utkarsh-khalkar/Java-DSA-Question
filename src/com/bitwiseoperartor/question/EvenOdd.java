package com.bitwiseoperartor.question;

public class EvenOdd {
    public static void main(String[] args) {

        int n=5;
        if (evenOdd(n))
        {
            System.out.println("Given No is Odd:"+n);
        }else {
            System.out.println("Given No is Even:"+n);
        }
    }

    public static boolean evenOdd(int n)
    {
        return  (n & 1)==1;
    }
}
