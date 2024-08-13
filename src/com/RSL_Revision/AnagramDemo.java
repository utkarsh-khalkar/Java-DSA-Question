package com.RSL_Revision;

public class AnagramDemo {
    public static  boolean anagramCheck(String str1,String str2)
    {
        char[] ch=str1.toCharArray();
        StringBuilder sb=new StringBuilder(str2);
        for (char c : ch) {
            int index=sb.indexOf(String.valueOf(c));
            if (index != -1) {
                sb.deleteCharAt(index);
            }   else {
                return  false;
            }
        }
        return sb.length()==0;
    }

    public static void main(String[] args) {
        System.out.println(anagramCheck("Java","aaJv"));
    }
}
