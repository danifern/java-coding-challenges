package com.challenges;

public class Challenge11_StringPool {

    /**
     * CHALLENGE 11: String Pool and Reference Equality (== vs .equals())
     * <p>
     * Instructions:
     * This is a conceptual challenge. Read the main method below. Before running it,
     * predict the output of each print statement and write down WHY you think that will be the result.
     * This tests your understanding of the Java String Pool and how '==' compares memory addresses
     * while '.equals()' compares the actual character sequence.
     * <p>
     * - String literals (e.g., "apple") are stored in a special memory area called the String Pool.
     * If you create multiple String literals with the same value, Java is smart and makes them all point
     * to the SAME object in the pool.
     * - Using 'new String("apple")' explicitly forces Java to create a NEW object in memory (on the Heap),
     * outside of the String Pool, even if an identical string already exists in the pool.
     */
    public static void main(String[] args) {
        String str1 = "apple"; // Stored in the String Pool
        String str2 = "apple"; // Java finds "apple" in the pool and points str2 to the same object as str1
        String str3 = new String("apple"); // Forces the creation of a NEW object on the Heap

        System.out.println("--- Comparing References with '==' ---");

        // Prediction 1: What will this print? Why?
        // '==' checks if str1 and str2 point to the exact same object in memory.
        System.out.println("str1 == str2 ? " + (str1 == str2));

        // Prediction 2: What will this print? Why?
        // '==' checks if str1 and str3 point to the exact same object in memory.
        System.out.println("str1 == str3 ? " + (str1 == str3));

        System.out.println("\n--- Comparing Values with '.equals()' ---");

        // Prediction 3: What will this print? Why?
        // '.equals()' checks if the sequence of characters in the objects is the same.
        System.out.println("str1.equals(str3) ? " + str1.equals(str3));
    }
}