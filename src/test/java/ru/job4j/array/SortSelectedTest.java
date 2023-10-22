package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortArray3() {
        int[] data = new int[]{9, 0, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 1, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortArray5() {
        int[] data = new int[]{4, -1, 8, -2, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-2, -1, 0, 4, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortArray7() {
        int[] data = new int[]{5, 7, 1, 6, 9, 7, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 5, 5, 6, 7, 7, 9};
        assertThat(result).containsExactly(expected);
    }
}