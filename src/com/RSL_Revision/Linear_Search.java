package com.RSL_Revision;

public class Linear_Search {
    public static int linearSearch(int[] arr,int k ) {

        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==k)
               return i;
        }
        return -1;
    }

    public static void main(String[] args) {
      int result=  linearSearch(new int[]{1,2,3,4},1);
        if (result == -1) {
            System.out.println("Element Not Found at Index.");
        }else {
            System.out.println("Element Found at Index:"+result);
        }
    }
}
