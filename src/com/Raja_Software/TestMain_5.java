package com.Raja_Software;

public class TestMain_5 {


  public static int minimumLength(String s) {

    int left = 0, right = s.length() - 1;
    while (left < right) {

        char leftChar = s.charAt(left), rightChar = s.charAt(right);
        if (leftChar != rightChar)

            break;
        while (left < right && s.charAt(left) == leftChar)

            left++;
        if (left == right)
            return 0;
        while (left < right && s.charAt(right) == rightChar)
            right--;        }
    return right - left + 1;
  }
    public static void main(String[] args) {
      System.out.println(minimumLength("ca"));
        System.out.println(minimumLength("aabccabba"));
  }
}