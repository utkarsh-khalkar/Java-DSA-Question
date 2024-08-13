package com.RSL_Revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateDemo {
    public static void checkDuplicate(int[] arr)
    {
        Set<Integer> set=new HashSet<>();
        for (int no : arr) {
            if (!set.add(no)) {
                System.out.println("Array Contains Duplicate Element");
                return;
            }
        }
        System.out.println("Array Doesn't Contain Duplicate Element.");

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,6};
        checkDuplicate(arr);
    }
}
