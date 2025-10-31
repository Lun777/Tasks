package org.example;

import org.example.task1_solution.Solution;

public class Main {
    public static void main(String[] args) {
        for (int i = -10; i <= 1000; i++) {
            System.out.println(Solution.getMaxK(i));
        }
    }
}