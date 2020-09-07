package ru.App;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        int[] values = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};

        int swapCount = 0;
        int lastIndex = values.length - 1;

        for (int i = lastIndex - 1; i >= 0; i--) {
            if (values[i] == 0) {
                values[i] = values[lastIndex - swapCount];
                values[lastIndex - swapCount] = 0;
                swapCount++;
            }
        }
        for (int i : values) {
            System.out.print(i + ", ");
        }
    }
}
