package com.pb.kunakh.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Заполните, пожалуйста, массив:");
            int [] mas = new int[10];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = input.nextInt();
            }
            System.out.print("Заполненый массив: ");
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
            boolean swap = true;
            int temp;
            while(swap){
                swap = false;
                for(int i = 0;i < mas.length-1; i++){
                    if(mas[i] > mas[i+1]){
                        temp = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = temp;
                        swap = true;
                    }}}
            System.out.println("\nОтсортированный массив методом пузырька от меньшего к большему: " + Arrays.toString(mas));

            int num = 0;
            int elSum = 0;
            for (int i = 0; i < mas.length; i++) {
                elSum += i;
                if (mas[i] > 0) {
                    num++;
                }}
            System.out.println("Количество элементов больше нуля: " + num + ". Сумма элементов массива: " + elSum + ".");
        }}
