package ru.job4j.loop;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passport;
        do {
            System.out.println("Введите пароль: ");
            passport = scanner.nextInt();
        } while (passport != 888);
        System.out.println("Пароль успешно введен!");
    }
}