package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int one, int two, int three) {
        int result;
        if (one > two && one > three) {
            result = one;
        }
        if (two > one && two > three) {
            result = two;
        } else {
            result = three;
        }
        return result;
    }

    public static int max(int one, int two, int three, int four) {
        int result;

        if (one > two && one > three) {
            result = one;
        }
        if (two > one && two > three) {
            result = two;
        }
        if (three > one && three > two) {
            result = three;
        } else {
            result = four;
        }
        return result;
    }
}