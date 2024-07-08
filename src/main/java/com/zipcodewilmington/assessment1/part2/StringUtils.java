package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        // Split the sentence into an array of words
        String[] words = sentence.split(" ");

        return words;
//        return null;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] words = sentence.split(" ");

        if (words.length > 0) {
            return words[0];
        } else {
            return "";
//            return null;
        }
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] words = sentence.split(" ");
        String firstWord = words[0];
        StringBuilder reversedWord = new StringBuilder(firstWord);
        reversedWord.reverse();

        return reversedWord.toString();
//        return null;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] words = sentence.split(" ");
        String firstWord = words[0];
        StringBuilder reversedWord = new StringBuilder(firstWord);
        reversedWord.reverse();
        reversedWord.setCharAt(0, Character.toUpperCase(reversedWord.charAt(0)));

        return reversedWord.toString();
//        return null;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(index);
        return sb.toString();
//        return null;
    }

}
