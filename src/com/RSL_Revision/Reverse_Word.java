package com.RSL_Revision;

public class Reverse_Word {
    public static  String reverseWord(String str)
    {
        String[] strings=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=strings.length-1;i>=0;i--)
        {
            sb.append(strings[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(reverseWord("I Love Java "));;
    }
}
