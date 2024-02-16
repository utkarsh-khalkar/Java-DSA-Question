package com.string.question;

import java.awt.*;

public class ReplaceSpecialCharacter {
    public static void main(String[] args) {

        String str="#$Java&%";
        String replaceString=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(replaceString);
    }
}
