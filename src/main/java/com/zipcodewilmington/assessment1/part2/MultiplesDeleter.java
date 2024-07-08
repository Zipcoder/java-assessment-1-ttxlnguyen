package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        int countOdds = 0;
        for (int num : ints) {
            if (num % 2 != 0) {
                countOdds++;
            }
        }
        Integer[] odds = new Integer[countOdds];
        int index = 0;
        for (int num : ints) {
            if (num % 2 != 0) {
                odds[index++] = num;
            }
        }
        return odds;
//        return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int countEvens = 0;
        for (int num : ints) {
            if (num % 2 == 0) {
                countEvens++;
            }
        }
        Integer[] evens = new Integer[countEvens];
        int index = 0;
        for (int num : ints) {
            if (num % 2 == 0) {
                evens[index++] = num;
            }
        }
        return evens;
//        return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int countDivisibleByThree = 0;
        for (int num : ints) {
            if (num % 3 == 0) {
                countDivisibleByThree++;
            }
        }
        Integer[] divisibleByThree = new Integer[countDivisibleByThree];
        int index = 0;

        for (int num : ints) {
            if (num % 3 == 0) {
                divisibleByThree[index++] = num+1;
            }
        }
        return divisibleByThree;
//        return null;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int countDivisibleByMultiple = 0;
        for (int num : ints) {
            if (num % multiple == 0) {
                countDivisibleByMultiple++;
            }
        }
        Integer[] divisibleByMultiple = new Integer[countDivisibleByMultiple];
        int index = 0;
        for (int num : ints) {
            if (num % multiple == 0) {
                divisibleByMultiple[index++] = num;
            }
        }
        return divisibleByMultiple;
//        return null;
    }
}
