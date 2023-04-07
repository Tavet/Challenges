package com.github.tavet.challenges.interviews.matchcraft.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateInput {
    public static void main(String[] args) throws FileNotFoundException {
        int counter = 0, times = 1, testCases = 30000;
        char currentChar = 'A';

        PrintWriter out = new PrintWriter("testCases.txt");
        for (int i = 0; i < testCases; i++) {
            int id = i;
            // set parent id only to previous numbers to avoid circular dependency
            Integer parentId = randomIntOrNull(0.2, i + 1);
            String categoryName = ("" + currentChar).repeat(times);

            counter++;
            if (counter == 26) {
                currentChar = 'A';
                counter = 0;
                times++;
            } else {
                currentChar++;
            }

            out.println(id + "," + categoryName + "," + parentId);
        }
        out.close();
    }

    public static Integer randomIntOrNull(double nullProbability, int testCases) {
        Random rand = new Random();
        if (rand.nextDouble() < nullProbability) {
            return null;
        } else {
            return rand.nextInt(testCases);
        }
    }
}
