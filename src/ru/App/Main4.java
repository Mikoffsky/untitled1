package ru.App;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Введите три числа: ");
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[3];
        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        Arrays.sort (values);
        System.out.println (values[0]);
        scanner.close();
    }
}
