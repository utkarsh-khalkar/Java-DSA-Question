package com.RSL_Revision;

public class ReplaceAlternate {
    public static void replace(String str)
    {
        String[] str2=str.split("\\.");
        int l=str2.length;
        StringBuilder string=new StringBuilder();
        string.append(" ").append(str2[0]).append(".");

        for(int i=1;i<l;i++)
        {
            if(i%2 !=0)
            {
                string.append("xyz").append(".");
            }else{
                string.append(str2[i]).append(".");
            }

        }
        System.out.println(string.toString());

    }

    public static  void rep(String str)
    {
        String[] strings=str.split("\\.");
        StringBuilder sb=new StringBuilder();
        int len=strings.length;
        sb.append(" ").append(strings[0]).append(".");
        for (int i=1;i<len;i++)
        {
            if(i %2 !=0)
            {
                sb.append("xyz").append(".");

            }else {
                sb.append(strings[i]).append(".");
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        replace("i.like.java.pro");
        rep("i.like.java.pro");
    }
}
