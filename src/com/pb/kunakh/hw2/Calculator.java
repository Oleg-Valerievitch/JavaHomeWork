package com.pb.kunakh.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.println("Первое значение");
        operand1 = scan.nextInt();

        System.out.println("Второе значение");
        operand2 = scan.nextInt();

        System.out.println("Операция");
        sign = scan.next();


        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
            case "-":
                System.out.println(operand1 - operand2);
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0)
                { System.out.println("Ошибка! На ноль делить нельзя");}
                else {
                    System.out.println(operand1 / operand2);}
        }
    }}