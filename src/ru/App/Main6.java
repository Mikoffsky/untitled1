package ru.App;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value == 905) {
            System.out.println("Москва. Стоимость разговора: 41.5р.");
        }
        else if (value == 491) {
            System.out.println("Краснодар. Стоимость разговора 26.9р.");
        }
        else if (value == 194) {
            System.out.println("Ростов. Стоимость разговора 19.8р.");
        }
        else if (value == 800) {
            System.out.println("Киров. Стоимость разговора: 50р.");
        }
        else {
            System.out.println("Город не найден");
        }
}
}
