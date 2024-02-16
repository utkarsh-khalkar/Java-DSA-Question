package com.FinzlyQuestion;

public class Test {
   int x=10;
   static int y=20;
}
class Demo
{
    public static void main(String[] args) {


        Test test=new Test();
        test.x=100;
        test.y=200;;

        Test test1=new Test();
        System.out.println(test.x);
        System.out.println(test.y);
        System.out.println(test1.y);
    }
}
