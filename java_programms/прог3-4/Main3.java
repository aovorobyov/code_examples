/*
Vorobyov Alexander Olegovich,
1032193998, NFIbd-01-19
-----------------------------
20.	Дана целочисленная матрица размера M x N. Найти номер первой из ее строк,
содержащих равное количество положительных и отрицательных элементов
(нулевые элементы матрицы не учитываются). Если таких строк нет, то вывести 0.
 */
package com.company;
import java.util.Scanner;
public class Main {

    private static int FindString(int[][] matrix, int m, int n) {
        // поиск строки с равным кол-во полож. и отр. эл-тов
        int string_num = 0, pos = 0, neg = 0;
        for (int i = 0; i < m; i++) { //для каждой строки считаем кол-во
            for (int j = 0; j < n; j++) { // положительный и отр. эл-тов
                if (matrix[i][j] < 0) {
                    neg++;
                } else {
                    pos++;
                }
            }
            if (string_num == 0) {
                if (neg == pos) { // после прохождения строки сравниваем кол-во
                    string_num = i + 1;
                } else { // иначе обнуляем переменные neg и pos для след. строки
                    neg = 0;
                    pos = 0;
                }
            }

        }
        System.out.println(string_num); //печать искомой строки (если строка не найдется,
        return string_num; // выведется исходное значение переменной, т.е 0, что удовл. условию задачи)
    }

    static void CreateMatrix(int[][] matrix, int n, int m) {
        // создание и печать матрицы
        int pos = 0, neg = 0; //объявление переменных

        for(int i = 0; i < m; i++) { //заполнение матрицы рандомом(-10;10)
            for(int j = 0; j < n; j++) { // и ее печать в консоль
                matrix[i][j] = (-10) + (int)(Math.random()*((10-(-10))+1));
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in); //настройка для ввода

        int m, n, string_num = 0; //объявление переменных

        do { // цикл для записи размерности матрицы с проверкой на неотр.
            System.out.println("Enter m: ");
            m = In.nextInt();
            System.out.println("Enter n: ");
            n = In.nextInt();
        } while(n <= 0 || m <= 0);

        int[][] matrix = new int[m][n]; //объявление матрицы размерностью М х N
        CreateMatrix(matrix, n, m); //создание матрицы
        FindString(matrix,m, n); //поиск нужной строки
    }
}
