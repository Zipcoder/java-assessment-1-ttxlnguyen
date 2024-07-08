package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int fullJumps = k / j;
        int remainder = k % j;
        int totalJumps = fullJumps;
        if (remainder > 0) {
            totalJumps++;
        }

        return totalJumps;
//        return -1;
    }
}
