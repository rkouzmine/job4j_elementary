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

    @Test
    public void whenMinInMiddle() {
        int[] data = {3, 5, 1, 2, 4};
        int result = MinDiapason.findMin(data, 1, 4);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void whenMinAtStart() {
        int[] data = {1, 5, 3, 2, 4};
        int result = MinDiapason.findMin(data, 0, 4);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void whenMinAtEnd() {
        int[] data = {3, 5, 4, 2, 1};
        int result = MinDiapason.findMin(data, 0, 4);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void whenElementFoundInRange() {
        int[] data = {5, 3, 7, 2, 4};
        int result = FindLoop.indexInRange(data, 7, 0, 4);
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void whenElementNotFoundInRange() {
        int[] data = {5, 3, 7, 2, 4};
        int result = FindLoop.indexInRange(data, 6, 0, 4);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swap(input, 0, 3);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swap(input, 1, 2);
        int[] expected = {1, 3, 2, 4};
        assertThat(result).isEqualTo(expected);
    }
}