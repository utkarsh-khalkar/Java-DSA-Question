package com.RSL_Revision;

public class Equabiliriam {
    public static int isEquabiliriam(int[] arr) {
        int arraySum=0;
        int leftSum=0;

        for (int no : arr) {
            arraySum+=no;
        }
        for (int i = 0; i < arr.length; i++) {
            arraySum -=arr[i];

            if (leftSum == arraySum) {
                return arr[i];
            }
            leftSum +=arr[i];
        }
        return  0;
    }

    public static void main(String[] args) {
        int[] arr={11,1,9,2};
        System.out.println(isEquabiliriam(arr));
    }
}
