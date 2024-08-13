package com.string.question;

public class Main
{
    public static boolean isPower(int a)
    {
        if(a==0)
        {
            return false;
        }

        return (a & (a-1))==0;
    }

    public static boolean sPower(int n)
    {
        if(n==0)
        {
            return false;
        }

        while(n !=1)
        {
            if(n % 2 !=0)
            {
                return false;
            }else{
                n=n/2;
            }
        }

        return true;
    }

    public static char stringDifference(String s, String t)
    {
        int total=0;
        for(int i=0;i<t.length();i++)
        {
            total=total+t.charAt(i);
        }
        for(int j=0;j<s.length();j++)
        {
            total=total-s.charAt(j);
        }


        return (char) total;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        if(sPower(6))
        {
            System.out.println("Power of 2");
        }else{
            System.out.println("Not Power of two");
        }

        System.out.println(stringDifference("abcd","abcdx"));
    }
}
