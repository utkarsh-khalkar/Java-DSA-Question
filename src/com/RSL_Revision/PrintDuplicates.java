package com.RSL_Revision;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
    public static void findDuplicates(String[] strings) {
        Set nonDuplicates=new HashSet();
        Set duplicates=new HashSet();
        for (String string : strings) {
            if(!nonDuplicates.contains(string))
            {
                nonDuplicates.add(string);
            }else {
                duplicates.add(string);
            }
        }
        System.out.println(duplicates);
    }

    public static void findDuplicatesFromArray(int[] arr) {

        Set<Integer> nonDuplicate=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();

        for (int no : arr) {
            if (!nonDuplicate.contains(no)) {
                nonDuplicate.add(no);
            }else {
                duplicates.add(no);
            }
        }
        System.out.println(duplicates);
    }

    public static void main(String[] args) {
        String[] str={"Java","CPP","C","Java","CPP","Python"};
        findDuplicates(str);


        int[]  arr={1,2,3,4,5,1,2};
        findDuplicatesFromArray(arr);
    }
}
