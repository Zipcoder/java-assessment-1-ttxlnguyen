package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
//        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String string = str;
        String reverse = new StringBuffer(string).reverse().toString();
        new StringBuilder(str).reverse().toString();
        return reverse;
//        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
//        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++)
        {
            char c = characters[i];
            if (Character.isUpperCase(c)) {
                characters[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                characters[i] = Character.toUpperCase(c);
            }
        }
        return new String(characters);
//        return null;
    }
}
