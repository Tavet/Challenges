// Please complete the following exercise using Java Programming Language.
// Your solution should compile and execute successfully.
package com.github.tavet.challenges.interviews.matchcraft;

import java.util.List;

public class Exercise {
    public static class Category {
        // Define the following fields with getters and setters:
        //    id: a unique numeric identifier of the category
        //    parentId: id of the parent category or null if it doesn't have the parent
        //    name: a string representation of category name

        // <enter your code here>
    }

    public static void printPath(List<Category> categories) {
        // Input is an _unordered_ collection of categories, where "id", "parentId", and "name" are pre-populated.
        // Implement this method to print the full path for each category in the collection.
        //
        // For example, if category A is parent of category B and category B is parent of category C, then
        //      the path for category A is "A"
        //      the path for category B is "A > B"
        //      the path for category C is "A > B > C"
        //  where "A" is the name of category A
        //        "B" is the name of category B
        //        "C" is the name of category C
        //
        // Note: Number of categories in a specific path can be greater than 3 as provided in this example.
        //       Your solution should work with any number of parents (e.g. A > B > C > D > ... > X)

     // <enter your code here>
    }

    public static void main(String... args) {
        // Define a collection of Category instances
        // Invoke "printPath" method above to print the path for all the categories in the collection
      
     // <enter your code here>
    }
}
