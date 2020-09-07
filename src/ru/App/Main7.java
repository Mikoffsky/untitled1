package ru.App;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        int sum=0;
        int[] values = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
            break;
        }
        Arrays.sort(values);
        System.out.println(values[13]);
        System.out.println(sum);
    }
}
