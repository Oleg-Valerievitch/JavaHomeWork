package com.pb.kunakh.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {


    public static void main(String[] args) {
        System.out.println("Отгадайте число от 0 до 100");
        System.out.println("Для выхода введите - 777");
        Scanner in = new Scanner(System.in);

        final int MAX_ATTEMPT = 100;
        int attempt = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int number = Math.abs(random.nextInt(101));

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            int a;
            System.out.println("Шанс" + attempt + ":");
            a = scan.nextInt();
            if (a > number) {
                System.out.println("Загадагле числе меньше указаного!");
                System.out.println("Какое число загадано?");
            }
            if (a < number) {
                System.out.println("Загадагле числе больше указаного!");
                System.out.println("Какое число загадано?");
            }
            if (a == 777) {
                System.out.println("Вы завершили игру! Будем рады видеть Вас снова");
                break;
            }

            if (a == number) {
                System.out.println("Победа !!! Вы отгадали число с " + attempt + " шанса");
                break;
            }
        }

        System.out.println("Игра окончена");
    }
}