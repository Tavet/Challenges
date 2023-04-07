package com.github.tavet.challenges.interviews.matchcraft;

import com.github.tavet.challenges.interviews.matchcraft.util.File;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseSolutionTest {
    ExerciseSolution exercise;

    @BeforeEach
    void setUp() {
        exercise = new ExerciseSolution();
    }

    @Test
    void testCase1() {
        List<ExerciseSolution.Category> test = new ArrayList<>(Arrays.asList(
                new ExerciseSolution.Category(1, null, "A"),
                new ExerciseSolution.Category(2, 1, "B"),
                new ExerciseSolution.Category(3, 1, "C"), // ** Repeat parent
                new ExerciseSolution.Category(4, null, "D"), // ** No parent
                new ExerciseSolution.Category(5, 4, "E"),
                new ExerciseSolution.Category(6, 3, "F"),
                new ExerciseSolution.Category(7, 6, "G"), // ** Longest path
                new ExerciseSolution.Category(8, 8, "H"), // ** parentId same as category ID
                new ExerciseSolution.Category(9, 999, "I") // ** Non-existing parentId
        ));

        long startTime = System.currentTimeMillis();

        exercise.main(test);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        // Average: 12ms
        System.out.println("\nElapsed time: " + elapsedTime + " milliseconds");
    }

    @Test
    void testCase2() {
        List<ExerciseSolution.Category> test = File.getInstance().readExerciseFile("interviews.matchcraft/500InputTest.txt");

        long startTime = System.currentTimeMillis();

        exercise.main(test);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        // Average: 14ms
        System.out.println("\nElapsed time: " + elapsedTime + " milliseconds");
    }

    @Test
    void testCase3() {
        List<ExerciseSolution.Category> test = File.getInstance().readExerciseFile("interviews.matchcraft/1000InputTest.txt");

        long startTime = System.currentTimeMillis();

        exercise.main(test);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        // Average: 19ms
        System.out.println("\nElapsed time: " + elapsedTime + " milliseconds");
    }

    @Test
    void testCase4() {
        List<ExerciseSolution.Category> test = File.getInstance().readExerciseFile("interviews.matchcraft/10000InputTest.txt");

        long startTime = System.currentTimeMillis();

        exercise.main(test);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        // Average: 261ms
        System.out.println("\nElapsed time: " + elapsedTime + " milliseconds");
    }

    @Test
    void testCase5() {
        List<ExerciseSolution.Category> test = File.getInstance().readExerciseFile("interviews.matchcraft/30000InputTest.txt");

        long startTime = System.currentTimeMillis();

        exercise.main(test);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        // Average: 2 sec 402 ms
        System.out.println("\nElapsed time: " + elapsedTime + " milliseconds");
    }
}
