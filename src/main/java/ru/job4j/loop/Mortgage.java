package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int count = 0;
        while (amount > 0) {
            amount = amount * percent + amount;
            amount -= salary;
            count++;
        }
        return count;
    }
}
