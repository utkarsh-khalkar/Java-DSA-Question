package com.string.question;

import java.util.HashMap;
import java.util.Map;

public class Character_Occurence {
    public static void main(String[] args) {

        Map<Character,Integer> map=new HashMap<>();

        String input="Programming";
        char[] chars=input.toCharArray();
        for (char ch:chars)
        {
            if (!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                int cnt=map.get(ch);
                map.put(ch,cnt+1);
            }

        }

        System.out.println(map);
    }
}
