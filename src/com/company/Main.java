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
        5)if System out println
        5)if System out println
          Доработки:
          1) countTrying++ (записываем в переменную количество попыток, затем сделаем вывод "Вы угадали число за "" попыток)
                */

public class Main {

    public static void main(String[] args) {
        Scanner inputLevel = new Scanner(System.in);
        Random rnd = new Random();

        final int HACKNUMBER = 1306;
        int compNumber;
        int userNumber = 0;
        int countTrying = 0;
        int lowBoard;
        int highBoard;
        int level;
        boolean inputResult;

        System.out.println("Выберите уровень сложности: \n 1 - Легкий \n 2 - Средний \n 3 - Сложный ");

        //    compNumber = rnd.nextInt(100) + 1;

        level = inputLevel.nextInt();

        switch (level) {
            case 1:
                compNumber = rnd.nextInt(100) + 1;
                lowBoard = 1;
                highBoard = 100;
                System.out.println("Лёгкий уровень сложности");
                break;
            case 2:
                compNumber = rnd.nextInt(500) + 1;
                lowBoard = 1;
                highBoard = 500;
                System.out.println("Средний уровень сложности");
                break;
            case 3:
                compNumber = rnd.nextInt(1000) + 1;
                lowBoard = 1;
                highBoard = 1000;
                System.out.println("Сложный уровень сложности");
                break;
            default:
                compNumber = rnd.nextInt(100) + 1;
                lowBoard = 1;
                highBoard = 100;
                break;
        }
        do {
            inputResult = true;
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Введите любое число от " + lowBoard + " до " + highBoard + ": ");
                userNumber = input.nextInt();

            } catch (Exception e) {
                inputResult = false;
            }
            //lowBoard = compNumber - rnd.nextInt(compNumber);
            //highBoard = compNumber + rnd.nextInt(lowBoard);

            if (userNumber == HACKNUMBER) {
                System.out.println("ВЫ ВВЕЛИ СЕКРЕТНОЕ ЧИСЛО, ОТВЕТ: " + compNumber);
            } else if (userNumber >= lowBoard && userNumber <= highBoard) {
                if (userNumber > compNumber) {
                    System.out.println("Введите число поменьше ");
                    highBoard = userNumber;
                } else if (userNumber < compNumber) {
                    System.out.println("Введите число побольше ");
                    lowBoard = userNumber;
                }
            }
            countTrying++;

        } while (compNumber != userNumber || inputResult == false);

        System.out.println("Поздравляем, вы угадали число ");
        if (countTrying >= 1 && countTrying <= 3) {
            System.out.println("Да ты гений!");

        } else if (countTrying >= 4 && countTrying <= 6) {
            System.out.println("Да тебе повезло!");
        } else {

            System.out.println("Тебе стоит выбрать другую тактику, слишком долго отгадывал( ");
        }
        System.out.println("Ты угадал с " + countTrying + " попытки");

    }
}