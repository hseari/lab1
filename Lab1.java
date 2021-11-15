package com.company;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        System.out.println("Задание 1");

        Scanner num1 = new Scanner(System.in);
        System.out.print("Введите целое число1: ");
        int a = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Введите целое число2: ");
        int b = num2.nextInt();

        Scanner num3 = new Scanner(System.in);
        System.out.print("Введите целое число3: ");
        int c = num3.nextInt();

        Scanner num4 = new Scanner(System.in);
        System.out.print("Введите целое число4: ");
        int d = num4.nextInt();

        double[] myList = {a, b, c, d};
        double min = Double.MAX_VALUE;
        for (int i = 0, myListLength = myList.length; i < myListLength; i++)
            min = Math.min(min, myList[i]);
        System.out.println("Наименьшее число: " + min);

        System.out.println("Задание 4");

        Scanner num = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = num.nextInt();
        String monthString;
        switch (month) {
            case 12:  case 1: case 2: monthString = "Зима";
                break;
            case 3: case 4: case 5: monthString = "Весна";
                break;
            case 6: case 7: case 8: monthString = "Лето";
                break;
            case 9: case 10: case 11: monthString = "Осень";
                break;
            default: monthString = "Ошибка";
                break;
        }
        System.out.println(monthString);

            }
        }



