package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for (int i = 0; i < objectArray.length; i++){
            if (objectArray[i].equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        return null;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Object, Integer> countMap = new HashMap<>();
        for (Object obj : objectArray) {
            countMap.put(obj, countMap.getOrDefault(obj, 0) + 1);
        }
        java.lang.Object mCommonObject = null;
        int maxCount = 0;
        for (Map.Entry<Object, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mCommonObject = entry.getKey();
            }
        }
        return (Object) mCommonObject;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Map<Object, Integer> countMap = new HashMap<>();
        for (Object obj : objectArray) {
            countMap.put(obj, countMap.getOrDefault(obj, 0) + 1);
        }
        Object lCommonObject = null;
        int minCount = Integer.MAX_VALUE;
        for (Map.Entry<Object, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                lCommonObject = entry.getKey();
            }
        }
        return (Object)lCommonObject;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int length1 = objectArray.length;
        int length2 = objectArrayToAdd.length;
        int combinedLength = length1 + length2;
        Object[] resultArray = Arrays.copyOf(objectArray, combinedLength);
        System.arraycopy(objectArrayToAdd, 0, resultArray, length1, length2);
        return resultArray;
    }
}
