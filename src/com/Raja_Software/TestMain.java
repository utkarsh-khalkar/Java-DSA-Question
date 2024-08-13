package com.Raja_Software;

public class TestMain {
    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0, tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }

        return sPointer == s.length();
    }

    public static void main(String[] args) {
        String s1 = "abc", t1 = "ahbgdc";
        String s2 = "axc", t2 = "ahbgdc";
        String s3 = "agb", t3 = "ahbgdc";

        System.out.println(isSubsequence(s1, t1));
        System.out.println(isSubsequence(s2, t2));
        System.out.println(isSubsequence(s3, t3));
    }
}
