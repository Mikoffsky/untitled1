package ru.App;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        int negsum = 0;
        int negcount = 0;
        int avg = 0;
        int[] values = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                sum = sum + values[i];
                counter ++;
            }
            else if (values[i] < 0) {
                negsum = negsum + values[i];
                negcount ++;
            }
            else if (values [i] < 0){
                avg = (avg + values [i]) / negcount;
            }
        }
        Arrays.sort(values);
        System.out.println(values[13]);
        System.out.println(+sum);
        System.out.println(counter);
        System.out.println(negsum);
        System.out.println(negcount);
        System.out.println(avg);
    }
}
