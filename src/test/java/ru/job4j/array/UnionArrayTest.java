package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UnionArrayTest {

    @Test
    public void whenUnionTwoArrayThenArrayZeroFiveEightTentTwelveEighteen() {
        int[] firstArray = new int[]{0, 5, 10};
        int[] secondArray = new int[]{8, 12, 18};
        int[] result = UnionArray.unionTwoArrayInOne(firstArray, secondArray);
        int[] expected = new int[]{0, 5, 8, 10, 12, 18};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenUnionTwoArrayThenArrayZeroOneSevenEightTentTwelveEighteen() {
        int[] firstArray = new int[]{0, 1, 7};
        int[] secondArray = new int[]{8, 10, 12};
        int[] result = UnionArray.unionTwoArrayInOne(firstArray, secondArray);
        int[] expected = new int[]{0, 1, 7, 8, 10, 12};
        assertThat(result).isEqualTo(expected);
    }

}