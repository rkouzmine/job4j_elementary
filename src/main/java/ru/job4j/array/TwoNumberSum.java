package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        var i = 0;
        var j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            }
            if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}