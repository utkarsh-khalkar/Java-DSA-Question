package com.Raja_Software;


public class TestMain_3  {
//    public static void replace(String str1) {
//        String[] str2 = str1.split("\\.");
//        int l = str2.length;
//        StringBuilder string = new StringBuilder();
//        string.append(" ").append(str2[0]).append(".");
//        for (int i = 1; i < l; i++) {
//            if (i % 2 != 0) {
//                string.append("xyz").append(".");
//
//            } else {
//                string.append(str2[i]).append(".");
//            }
//        }
//        System.out.println(string.toString());
//    }
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
    public static void main(String[] args) {
        replace("i.like.this.program.very.much");
    }
}
