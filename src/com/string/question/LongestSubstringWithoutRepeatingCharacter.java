package com.string.question;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {

    LenghtOfLongestSubstring("aabbxyz");
    }

    public static void LenghtOfLongestSubstring(String string)
    {
        String longestSubstring=null;
        int longstSubstringLength=0;
        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        char[] arr=string.toCharArray();
        for (int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            if (!map.containsKey(ch))
            {
                map.put(ch,i);

            }else {
                i=map.get(ch);
                map.clear();
            }
            if (map.size()>longstSubstringLength)
            {
                longstSubstringLength=map.size();
                longestSubstring=map.keySet().toString();
            }
        }

        System.out.println("Longest Substring Length="+longstSubstringLength);
        System.out.println("Longest Substring="+longestSubstring);
    }
}
