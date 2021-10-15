package com.pb.kunakh.hw3;

import java.util.Arrays;

public class Array {


    private static int temp;

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mas = array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
            System.out.println("Укажите целое число");

        }
        int sum = Arrays.stream(array).sum();
        System.out.println("Сумма целых чисел " + sum);
        int positive= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                positive ++;
            System.out.println("Количество элементов больше ноля = "+i);
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (i = 0; i < array.length; i++)
                    if (array[i] > array[i + 1])
                        array[i + 1] = temp;
                isSorted = false;

            }
        }
    }

    public static void setTemp(int temp) {
        Array.temp = temp;
    }
}

