package com.FinzlyQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class String_JoinerDemo {

    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");

       /*stringJoiner.add("A").add("B").add("C");
        System.out.println(stringJoiner);

        StringJoiner stringJoiner1=new StringJoiner(":");
        stringJoiner1.add("D").add("E");

        System.out.println(stringJoiner1);

        stringJoiner.merge(stringJoiner1);
        System.out.println(stringJoiner);*/

        StringJoiner stringJoiner1=new StringJoiner(",","{","}");
        stringJoiner1.add("Utkarsh").add("Dattatray").add("Khalkar");

        String string=stringJoiner1.toString();
        System.out.println(string);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        String commaSeparatedNumbers = numbers.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(", ","[","]"));

        System.out.println(commaSeparatedNumbers);

        StringJoiner strj=new StringJoiner(",","{","}");
        strj.add("A").add("B").add("C").add("E");
        System.out.println(strj);

        StringJoiner strj1=new StringJoiner(",","{","}");
        strj1.add("F").add("G").add("I");
        System.out.println(strj1);

        strj.merge(strj1);
        System.out.println(strj);

    }

}
