package org.example.task1_solution;

public class Solution {
    public static int getMaxK(int m) {
        if (m == 1) {   // по условию сказано, что k и m целые числа,
            return -1;  // при k = 0, 4^k = 1; при k = -1 = 0,25 - решение,
        }               // т.к. 4^k строго возрастающая функция

        if (m < 1) {
            return -9999; // имеется ввиду что не существует валидного k
        }

        int numShifts = 0;
        int temp = m - 1;

        while (temp > 1) {
            temp = temp >> 1;
            numShifts++;
        }

        return numShifts / 2;
    }
}
