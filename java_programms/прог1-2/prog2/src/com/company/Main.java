/*
Vorobyov Alexander Olegovich,
1032193998, NFIbd-01-19
-----------------------------
Получить действительную матрицу 7х7. Заполнить строки по
заданным формулам.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        final int n = 8; //размерность массива в константу
        double[][] mass = new double[n][n]; //объявление массива

        for(int j = 1; j < n; j++) { //заполнение по формуле первой строки
            mass[1][j] = 2 * j + 3;
        }
        for(int j = 1; j < n; j++) { //заполнение по формуле второй строки
             mass[2][j] = j - (3 / (2 + 1.0 / j));
        }
        for(int i = 3; i < n; i++){ //заполнение последующих строк суммируя две предыдущие
            for(int j = 1; j < n; j++){
                mass[i][j] = mass[i-2][j] + mass[i-1][j];
            }
        }
        for(int i = 1; i < n; i++){ //цикл для печати массива
            for(int j = 1; j < n; j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
