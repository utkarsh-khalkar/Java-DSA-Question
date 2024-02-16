package com.string.question;

public class ReverseString {
    public static void main(String[] args) {

        String str="Hello";

        //Approach 1
        System.out.println("String Reverse Using Approach 1");
        char[] ch1=str.toCharArray();
        for (int i=ch1.length-1;i>=0;i--)
        {
            System.out.print(ch1[i]);
        }

        // String Reverse Using Approach 2
        char[] ch=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        System.out.println("\nString Reverse Using Approach 2.");
        while (left<right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            right--;
            left++;
        }

        String str1=new String(ch);
        System.out.print(str1);

        // String Reverse using Approach 3
        System.out.println("\nString Reverse Using Approach 3");
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }
}
