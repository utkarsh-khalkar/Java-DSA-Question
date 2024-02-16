package com.string.question;

public class RemoveWhiteSpace {
    public static void main(String[] args) {

        String str="j   a   v  a";
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
}
