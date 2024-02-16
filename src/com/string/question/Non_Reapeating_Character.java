package com.string.question;

import java.util.*;
// Program for the First Non Repeating Character.
public class Non_Reapeating_Character {
    public static void main(String[] args) {

        // First Approach without Using Collection.
        String str="AbcA";
        char[] chars=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            boolean flag=true;
            for (int j = 0; j < str.length(); j++) {
                if (i!=j && str.charAt(i)==str.charAt(j))
                {
                    flag=false;
                    break;
                }
            }
            if (flag) {
                System.out.print(" "+str.charAt(i));
                break;
            }
        }


        // Second Approach Using Collection.
        System.out.println("\nSecond Approach..");
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1)
            {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
