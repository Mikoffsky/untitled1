package ru.App;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if ( value <0){
            int a = value - 1;
            System.out.println(a);
        }
        else if (value > 0)
        {
            int i = value + 2;
            System.out.println(i);
        }
        else
        {
            System.out.println(10);
        }
    }
}
