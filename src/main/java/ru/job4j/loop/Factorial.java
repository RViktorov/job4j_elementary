package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        if (number == 0) {
            return result;
        }
        if (number > 0) {
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
        }
        return result;
    }
}