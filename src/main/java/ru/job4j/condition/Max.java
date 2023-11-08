package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int down) {
        int result = 0;
        if (left > right && left > down) {
            result = left;
        } else if (right > down) {
            result = right;
        } else {
            result = down;
        }
        return result;
    }

    public static double max(int left, double right, int down) {
        double result = 0;
        if (left > right && left > down) {
            result = left;
        } else if (right > down) {
            result = right;
        } else {
            result = down;
        }
        return result;
    }

    public static double max(double left, int right, int down) {
        double result = 0;
        if (left > right && left > down) {
            result = left;
        } else if (right > down) {
            result = right;
        } else {
            result = down;
        }
        return result;
    }

    public static int max(int left, int right, int down, int up) {
        return Math.max(Math.max(left, right), Math.max(down, up));
    }

    public static void main(String[] args) {
        int msg = Max.max(1, 2);
        System.out.println(msg);
    }
}