package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int eachJump = k / j;
        int remainder = k % j;
        int Jumps = eachJump;
        if (remainder > 0) {
            Jumps++;
        }

        return Jumps;
//        return -1;
    }
}