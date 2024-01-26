package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[]{5, 1, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 5, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[]{5, 1, 8, 77, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 1, 5, 8, 77};
        assertThat(result).containsExactly(expected);
    }

}