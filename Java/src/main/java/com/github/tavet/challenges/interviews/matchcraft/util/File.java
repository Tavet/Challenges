package com.github.tavet.challenges.interviews.matchcraft.util;

import com.github.tavet.challenges.interviews.matchcraft.ExerciseSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class File {
    private static File file;

    private File() {
    }

    public static File getInstance() {
        if (file == null) {
            file = new File();
        }
        return file;
    }

    public List<ExerciseSolution.Category> readExerciseFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + fileName)))) {
            return br.lines()
                    .map(s -> {
                        String[] values = s.split(",");
                        ExerciseSolution.Category category = new ExerciseSolution.Category();
                        category.setId(Integer.parseInt(values[0]));
                        category.setName(values[1]);
                        category.setParentId(values[2].equals("null") ? null : Integer.parseInt(values[2]));
                        return category;
                    }).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
