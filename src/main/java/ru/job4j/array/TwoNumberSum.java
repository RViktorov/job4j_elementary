package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        for (int indexNumber1 = 0; indexNumber1 < array.length; indexNumber1++) {
            for (int indexNumber2 = indexNumber1 + 1; indexNumber2 < array.length; indexNumber2++) {
                if (array[indexNumber1] + array[indexNumber2] == target) {
                    return new int[]{indexNumber1, indexNumber2};
                }
            }
        }
        return new int[0];
    }

}