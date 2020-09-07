package ru.App;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value= scanner.nextInt();
        int a = value/100;
        int b = ((value - (a * 100)) / 10);
        int c = value - (a * 100) - (b * 10);
        int d = (a + b + c);
        System.out.println(d);
    }
}