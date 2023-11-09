package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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
    void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To6Then6() {
        int left = 4;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To4To3Then5() {
        int left = 5;
        int right = 4;
        int down = 3;
        int result = Max.max(left, right, down);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int left = 1;
        int right = 2;
        int down = 3;
        int up = 4;
        int result = Max.max(left, right, down, up);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}