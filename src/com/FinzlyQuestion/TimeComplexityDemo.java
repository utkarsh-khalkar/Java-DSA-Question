package com.FinzlyQuestion;

public class TimeComplexityDemo {
    public static void main(String[] args) {

        double now=System.currentTimeMillis();
        System.out.println(now);
        TimeComplexityDemo demo=new TimeComplexityDemo();
       // System.out.println(findSum(9999));
        System.out.println(findSum1(9999));
        System.out.println("Time taken:::"+(System.currentTimeMillis()-now)+" in Milisecond.");
    }

    public static int findSum(int n)
    {
        return n*(n+1)/2;
    }

    public static int findSum1(int n)
    {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+i;
        }

        return sum;
    }
}
