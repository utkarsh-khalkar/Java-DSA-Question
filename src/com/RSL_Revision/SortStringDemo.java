package com.RSL_Revision;

import java.util.Arrays;

public class SortStringDemo {
    public static String sortString(String string) {
        char[] ch=string.toLowerCase().toCharArray();
        Arrays.sort(ch);

        String string1=new String(ch);
        return string1;
    }

    public static void main(String[] args) {
        System.out.println(sortString("Java"));
    }
}
