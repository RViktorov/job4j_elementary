package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point point = new Point(0, 0);
        Point point1 = new Point(2, 0);
        double output = point.distance(point1);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to50then3() {
        double expected = 3;
        Point point = new Point(2, 0);
        Point point1 = new Point(5, 0);
        double output = point.distance(point1);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus11to42then5Dot09() {
        double expected = 5.09;
        Point point = new Point(-1, 1);
        Point point1 = new Point(4, 2);
        int x1 = -1;
        double output = point.distance(point1);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus40to102then14Dot14() {
        double expected = 14.14;
        Point point = new Point(-4, 0);
        Point point1 = new Point(10, 2);
        double output = point.distance(point1);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}