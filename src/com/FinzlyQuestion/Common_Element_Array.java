package com.FinzlyQuestion;

import java.util.HashSet;
import java.util.Set;

public class Common_Element_Array {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int[] arr1={2,3,6,7,8};
        //commonElement(arr,arr1);
        unionofArray(arr,arr1);
    }

    public static void unionofArray(int[] arr,int[] arr1)
    {
        Set<Integer> s=new HashSet<>();
        for (int x:arr)
        {
            s.add(x);
        }
        for (int x:arr1)
        {
            s.add(x);
        }
        System.out.println("Union of Two Arrat are:"+s);
    }

    public static void commonElement(int[] arr,int[] arr1)
    {
        Set<Integer> s=new HashSet<>();

        for (int c:arr)
        {
            s.add(c);
        }
        for (int x: arr1)
        {
            if (s.contains(x))
            {
                System.out.println(x+" ");
            }
        }
    }
}
