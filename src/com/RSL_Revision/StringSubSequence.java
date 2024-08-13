package com.RSL_Revision;
/*
 Title: Write the Program to find the Subsequence of the two String.
 */
public class StringSubSequence {
    public static boolean isSubsequence(String s, String t) {

        int sPointer=0;
        int tPointer=0;

        while (sPointer<s.length() && tPointer<t.length())
        {
            if(s.charAt(sPointer)== t.charAt(tPointer))
            {
                sPointer++;
            }
            tPointer++;
        }
        return sPointer==s.length();
    }

    public static void main(String[] args) {
        boolean result=isSubsequence("abc","xybmc");
        System.out.println(result);
    }
}
