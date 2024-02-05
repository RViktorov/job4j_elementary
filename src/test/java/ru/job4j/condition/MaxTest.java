package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To2Then2() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To4Then4() {
        int left = 2;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenOneAndFourAndFiveThenMaxFive() {
        int one = 1;
        int two = 4;
        int three = 5;
        int result = Max.max(one, two, three);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenOneAndSixAndNineAndTwoThenMaxFive() {
        int one = 1;
        int two = 6;
        int three = 9;
        int four = 2;
        int result = Max.max(one, two, three, four);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}