package com.FinzlyQuestion;
import java.util.*;

import java.util.*;

public class BracketMatcher {

    public static int bracketMatcher(String str) {
        char[] ch=str.toCharArray();
        Stack<Character> stack=new Stack<>();

        for(char c: ch )
        {
            if(c=='(')
            {
                stack.push(c);
            }else if(c==')')
            {
                if(stack.isEmpty())
                {
                    return 0;
                }
                else{
                    stack.pop();
                }

            }
        }

        return stack.isEmpty() ? 1:0;

    }


    public static void main(String[] args)
    {
        int ans=bracketMatcher("(code)(byte)");
        System.out.println(ans);
    }

}
