package com.string.question;

import java.util.Arrays;

public class SortCharacterofString {
    public static void main(String[] args) {
        sortStringCharacter("Utkarsh");
        String string="Utkarsh";

       char[] ch=string.toCharArray();
       Arrays.sort(ch);
        System.out.println(new String(ch));
    }


    // Aproach 1 without using  the Sort method
    public static void sortStringCharacter(String str)
    {
        char[] arr=str.toLowerCase().toCharArray();
        char temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
