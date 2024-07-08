package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        // Calculate full jumps of j units
        int fullJumps = k / j;

        // Calculate remaining distance after full j unit jumps
        int remainder = k % j;

        // Total jumps needed
        int totalJumps = fullJumps;

        // If there's any remainder, we need one additional jump
        if (remainder > 0) {
            totalJumps++;
        }

        return totalJumps;
//        return -1;
    }
}
