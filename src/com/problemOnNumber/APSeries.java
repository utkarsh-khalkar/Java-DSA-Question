package com.problemOnNumber;

/*
    Title: Given an A.P. Series, we need to find the sum of the Series
    Date: 23:02:2024
    Time: 10:45 PM
    Author: Utkarsh Khalkar


    What is the AP Series?
  -->A.P. is the series of terms having the first term as a and d, common difference. Every next term in the A.P. is greater than the previous term by d units.

    Example –

    -2, 3 , 8 , 13 , 18 , 23 , 28 , 33

    First term , a = – 2

    Common Difference , d=5
 */
public class APSeries {
    public static void main(String[] args) {

        System.out.println(sumofAp(2,2,4));
        System.out.println(sumofAp2(2,2,4));
    }

    static double sumofAp(double a, double d, int n)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++)
        {
            sum += a;
            a += d;
        }
        return sum;
    }

    // Sum of AP Series Using Formula...
    // n/2(2(a)+(n-1)d)
    static double sumofAp2(double a, double d, int n)
    {
        double sum = (n / 2.0) * (2.0 * a + (n - 1) * d);
        return sum;
    }
}
