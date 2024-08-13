package com.RSL_Revision;

public class BinarySearch {
    public static int binarySearch(int[] arr,int k,int low,int high) {
        while (low <= high) {
            int mid=low+(high-low)/2;
            if (arr[mid] == k)
                return mid;

            if(arr[mid]<k)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int low=0;
        int high=arr.length;
        int k=4;
        int result=binarySearch(arr,k,low,high-1);

        if (result == -1) {
            System.out.println("Element Not Found in the Array.");
        }else {
            System.out.println("Element Found in Array:at Index."+result);
        }
    }
}
