package com.string.question;

public class Reverse_Word {
    public static void main(String[] args) {
        String sentence="I Love Java Programming";
        String[] words=sentence.split(" ");
        

        String rev="";
        for (String word : words) {
            String reverseWord="";
            for (int i=word.length()-1;i>=0;i--)
            {

                reverseWord=reverseWord + word.charAt(i);
            }
            rev=rev+reverseWord+" ";
        }
        System.out.println("Reverse Word from the String:"+rev);
    }
}
