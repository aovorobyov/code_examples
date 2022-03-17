/*
Vorobyov Alexander Olegovich,
1032193998, NFIbd-01-19
-----------------------------
40.	 Дана матрица размера  (N – четное число).
Поменять местами левую и правую половины матрицы.
 */
package com.company;
import java.util.Scanner;
public class Main {

    private static void SwapHalves(int[][] matrix, int m, int n) {
        //меняем местами левую и правую часть матрицы
        int tmp; //временная переменная
        for(int i = 0; i < m; i++) { //заменяем через цикл лементы, используя врем. переменную
            for(int j = 0; j < n/2; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][j+n/2];
                matrix[i][j+n/2] = tmp;
            }
        }
        System.out.println("Modified matrix:"); //печать новой матрицы
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    static void CreateMatrix(int[][] matrix, int n, int m) {
        // создание и печать матрицы
        int pos = 0, neg = 0; //объявление переменных
        System.out.println("Initial matrix:");
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

        int m, n; //объявление переменных

        do { // цикл для записи размерности матрицы с проверкой на неотр. и четность n
            System.out.println("Enter m: ");
            m = In.nextInt();
            System.out.println("Enter even n: ");
            n = In.nextInt();
        } while(n <= 0 || n % 2 != 0 || m <= 0);

        int[][] matrix = new int[m][n]; //объявление матрицы размерностью М х N
        int[][] new_matrix = new int[m][n]; //объявление новой матрицы размерностью М х N

        CreateMatrix(matrix, n, m); //создание матрицы
        SwapHalves(matrix, m, n); //изменение позийций по условию
    }
}
