package ru.job4j.array;

import java.util.Arrays;

public class UnionArray {

    public static int[] unionTwoArrayInOne(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int j = 0;
        int i = 0;
        int index = 0;
        while (j < firstArray.length && i < secondArray.length) {

            if (firstArray[i] < secondArray[j]) {
                resultArray[index] = firstArray[i];
                i++;
            } else {
                resultArray[index] = secondArray[j];
                j++;
            }
            index++;
        }
        if (i < firstArray.length) {
            System.arraycopy(firstArray, i, resultArray, index, firstArray.length - i);
        } else {
            System.arraycopy(secondArray, j, resultArray, index, secondArray.length - j);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] array1 = {12, 15, 18, 21, 23};
        int[] array2 = {2, 4, 17, 19, 20};
        System.out.println(Arrays.toString(unionTwoArrayInOne(array1, array2)));
    }

}