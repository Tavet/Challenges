package com.github.tavet.challenges.interviews.matchcraft;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

// I did solve this on January 27, 2023
public class ExerciseSolution {
    // The first Boolean is the result of the path matching, and the second String is the matched path. 
    private static Map<Integer, Map.Entry<Boolean, String>> pathsCache = new HashMap<>();

    public static class Category {
        private Integer id;
        private Integer parentId;
        private String name;

        public Category() {
        }

        public Category(Integer id, Integer parentId, String name) {
            this.id = id;
            this.parentId = parentId;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Integer getParentId() {
            return parentId;
        }

        public void setParentId(Integer parentId) {
            this.parentId = parentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private static void printPath(List<Category> categories) {
        categories.forEach(category -> printPath(categories::stream, category, category.getId()));
    }

    private static void printPath(Supplier<Stream<Category>> categories, Category category, int currentCategoryId) {
        Map.Entry<Boolean, String> parentEntry = pathsCache.get(category.getParentId());
        String currentPath = pathsCache.get(currentCategoryId) != null ? pathsCache.get(currentCategoryId).getValue() : "";
        String path = "";
        boolean pathFound = false;

        // This filters the categories to get the category parent. It returns the parent category if it exists or empty otherwise.
        Optional<Category> categoryParent = categories.get().filter(c -> Objects.nonNull(category.getParentId()) &&
                category.getId() != category.getParentId() && c.getId() == category.getParentId()).findAny();

        // We check if the parent exists, if not, we print the path and set the pathFound to true
        if (categoryParent.isPresent()) {
            if (parentEntry != null && parentEntry.getKey()) {
                path += parentEntry.getValue() + " > ";
                pathFound = true;
            } else {
                printPath(categories, categoryParent.get(), currentCategoryId);
                path += " > ";
            }
        } else {
            path += "\n";
            pathFound = true;
        }
        path += category.getName();

        // The path is then added to the cache, along with a boolean indicating if it was found or not.
        // If it was not found, then it iterates again until all the path is found completely
        Map.Entry<Boolean, String> newMapEntry = new AbstractMap.SimpleEntry<>(pathFound, currentPath + path);
        pathsCache.put(currentCategoryId, newMapEntry);
        System.out.print(path);
    }

    public void main(List<Category> categories) {
        printPath(categories);
    }
}