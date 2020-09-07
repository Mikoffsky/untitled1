package ru.App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value= scanner.nextInt();
        int a = value%10;
        System.out.println(a);
    }
}
