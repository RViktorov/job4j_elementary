package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart1Finish4Then10() {
        int start = 1;
        int finish = 4;
        int expected = 10;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish4Then0() {
        int start = 10;
        int finish = 4;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish7Then25() {
        int start = 3;
        int finish = 7;
        int expected = 25;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

}