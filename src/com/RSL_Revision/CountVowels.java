package com.RSL_Revision;

public class CountVowels {
    public static  int countVowel(String string)
    {
        char[]  ch=string.toLowerCase().toCharArray();
        int count=0;
        for (char c : ch) {
            if(c=='a'||c=='o'||c=='e'||c=='i'|| c=='u')
            {
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        System.out.println("Total Vowel in String:"+countVowel("Utkarsh"));
    }
}
