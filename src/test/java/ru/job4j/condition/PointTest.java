package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12To34Then2dot82() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double expected = 2.82;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when56To910Then16dot49() {
        Point a = new Point(5, -6);
        Point b = new Point(9, 10);
        double expected = 16.49;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01To04Then3() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 4);
        double expected = 3;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13To37Then4dot47() {
        Point a = new Point(1, 3);
        Point b = new Point(3, 7);
        double expected = 4.47;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20To02Then2dot82() {
        Point a = new Point(2, 0);
        Point b = new Point(0, 2);
        double expected = 2.82;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}