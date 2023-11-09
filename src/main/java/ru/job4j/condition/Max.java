package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int down) {
        return max(max(left, right), down);
    }

    public static int max(int left, int right, int down, int up) {
        return max(max(left, right), max(down, up));
    }

    public static void main(String[] args) {
        int msg = Max.max(1, 2);
        System.out.println(msg);
    }
}