package com.string.question;

import java.util.Arrays;

public class CharWithOccurence {
    public static void main(String[] args) {
        String input="AAAAAA";
        char replaceWith='A';

        int idx=input.indexOf(replaceWith);
        if (idx==-1)
        {
            System.out.println("Given Character is not Present in the String.");
            System.exit(0);
        }
//
//        char[] chars=input.toCharArray();
//        int cnt=1;
//        for (int i=0;i<chars.length;i++)
//        {
//            if (chars[i]==replaceWith)
//            {
//                chars[i]=String.valueOf(cnt).charAt(0);
//                cnt++;
//            }
//        }
//        System.out.println(Arrays.toString(chars));

        char[] arr=input.toCharArray();
        int cnt=1;
        for (int i=0;i<arr.length;i++)
        {
            char ch=input.charAt(i);
            if (ch==replaceWith)
            {
              input= input.replaceFirst(String.valueOf(replaceWith),String.valueOf(cnt));
                cnt++;
            }
        }
        System.out.println(input);

    }
}
