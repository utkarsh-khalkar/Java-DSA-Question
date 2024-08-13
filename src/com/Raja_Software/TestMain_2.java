package com.Raja_Software;

public class TestMain_2 {
    public static int findEquilibrium(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;


        for (int num : arr) {
            totalSum += num;
        }


        for (int i = 0; i < arr.length; i++) {

            totalSum -= arr[i];


            if (leftSum == totalSum) {
                return arr[i];
            }


            leftSum += arr[i];
        }


        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 7, 5, 2, 6};
        int[] arr2 = {10, 1, 1, 9};

        System.out.println("Output 1: " + findEquilibrium(arr1));
        System.out.println("Output 2: " + findEquilibrium(arr2));
    }
}

