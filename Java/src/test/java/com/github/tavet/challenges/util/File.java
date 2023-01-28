package com.github.tavet.challenges.util;

import java.io.*;

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

    public int[] readIntFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + fileName)))) {
            return br.lines()
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
