package com.problemOnNumber;
/*
    Problem Statement: Given a geometric Progression (G.P) sequence with some inputs as:-

    a, first term
    r, common ratio
    n, number of terms
    Write a program to find the sum of the geometric Progression Series.
    Date: 23-02-2024
    Time:11:10 PM
    Author: Utkarsh Khalkar.
    */

public class GPSeries {
    public static void main(String[] args) {

        System.out.println(gpSeries(2,2,4));
        System.out.println(SumofGP(2,2,5));
    }

    // By Using For Loop
    public static double gpSeries(double a, double r, int n) {
        double sum=0.0;
        for (int i = 1; i<=n; i++) {
            sum+=a;
            a*=r;

        }
        return sum;
    }

    // By using Formula
    public static float SumofGP(float a, float r, int n) {
        float sum = a * ((float) Math.pow(r, n) - 1) / (r - 1);
        return sum;
    }
}
