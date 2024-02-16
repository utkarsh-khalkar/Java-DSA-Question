package com.string.question;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String string="Programming";

        System.out.println("Removing Duplicates Using Approach 1");
        // Approach 1 Using Java 8
        StringBuilder stringBuilder=new StringBuilder();
        string.chars().distinct().forEach(c->stringBuilder.append((char)c));
        System.out.print(stringBuilder);

        // Approach 2
        System.out.println("\nRemoving Duplicates Using Approach 2");
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            int idx=string.indexOf(ch,i+1);
            if (idx==-1)
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);

        // Approach 3
        System.out.println("Removing Duplicates Using Approach 3");
        StringBuilder sb3=new StringBuilder();
        char[] arr=string.toCharArray();
        for (int i=0;i<string.length();i++)
        {
            boolean repeated=false;
            for (int j=i+1;j<string.length();j++)
            {
                if (arr[i]==arr[j])
                {
                    repeated=true;
                    break;
                }
            }
            if (!repeated)
            {
                sb3.append(arr[i]);
            }
        }
        System.out.println(sb3);

        // Approach 4
        System.out.println("Removing Duplicates Using Approach 4");
        Set<Character> set=new LinkedHashSet<>();
        StringBuilder stringBuilder1=new StringBuilder();
        for (int i=0;i<string.length();i++)
        {
            set.add(string.charAt(i));
        }
        for (Character c:set)
        {
            System.out.print(" "+c);
        }

    }
}
