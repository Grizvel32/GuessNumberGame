package com.company;

import java.util.Random;
import java.util.Scanner;

/*1)комп загадал число от 1 до 100
        2)спросить у пользователя какое число он хочет ввести
        3)считать введённое пользователем число
        4)сравнить введённое пользователем и загаднное компом число
        5.1)если число пользователя МЕНЬШЕ числа компа, то вывести подсказку что введите число больше и перейти на шаг 2
        5.2)если число пользователя БОЛЬШЕ числа компа, то вывести подсказку что введите число меньше и перейти на шаг 2
        5.3)если число пользователя РАВНО числу компа, то вывести что вы угадали и закончить программу

        1)Random random = new Random()
        2)System out println
        3)Scanner input NextInt
        4)if comp==Random
        5)if System out println*/
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int compNumber;
        int userNumber;


        compNumber = rnd.nextInt(100) + 1;

        do {
            System.out.print("Введите любое число от 1 до 100: ");
            userNumber = input.nextInt();

            if (userNumber > compNumber) {
                System.out.println("Введите число поменьше ");
            } else if (userNumber < compNumber) {
                System.out.println("Введите число побольше ");
            }
        } while (compNumber != userNumber);

        System.out.println("Поздравляем, вы угадали число ");


    }
}
