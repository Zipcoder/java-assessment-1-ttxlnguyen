package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        StringBuilder sb = new StringBuilder(input);
        int count = 0;
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                sb.insert(right + 1, sb.charAt(left));
                count++;
            }
            left++;
            right = sb.length() - 1 - count;
        }
        return count;

//        return null;
    }
}
