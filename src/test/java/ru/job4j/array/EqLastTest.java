package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqLastTest {

    @Test
    void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {8, 8, 16};
        boolean result = EqLast.check(left, right);
        assertThat(result).isFalse();
    }
}