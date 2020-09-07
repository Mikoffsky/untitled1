package ru.App;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value < 0) {
            System.out.println("Отрицательное число");
        } else if (value > 0) {
            System.out.println("Положительное число");
        }
        if (value % 2 != 0) {
            System.out.println("Нечетное число");
        } else if (value % 2 == 0) {
            System.out.println("Четное число");
        }
        if (value == 0) {
            System.out.println("0");
        }
    }
}