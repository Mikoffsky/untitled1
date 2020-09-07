package ru.App;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if ( value <0){
            System.out.println(value);
        }
        else
        {
            int i = value + 1;
            System.out.println(i);
        }
    }
}
