package com.github.tavet.challenges.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GamingArrayTest {
    GamingArray gamingArray;

    @BeforeEach
    void setUp() {
        gamingArray = new GamingArray();
    }

    @Test
    void testCase1() {
        final String expected = "ANDY";
        List<Integer> list = Arrays.asList(48603, 39761, 92458, 97315, 22399, 95568, 39876, 22840, 55717, 80972, 55278,
                86905, 65466, 95977, 38341, 57720, 83835, 84014, 12235, 96900, 60173, 33471, 44821, 76899, 53668, 43062,
                38962, 25840, 71424, 13227, 30027, 30767, 35937, 94062, 63792, 15521, 6670, 33022, 59834, 43226, 99586,
                98674, 51475, 14895, 30208, 27006, 92901, 15182, 57760, 31164, 44991, 9370, 83099, 86811, 92128, 74625,
                19528, 71580, 3576, 21442, 9062, 10094, 72777, 84136, 45820, 64720, 74064, 26713, 36019, 21694, 47954,
                27982, 87650);

        assertEquals(expected, gamingArray.gamingArray(list));
    }
   
}
