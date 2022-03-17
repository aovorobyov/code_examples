/*
Vorobyov Alexander Olegovich,
1032193998, NFIbd-01-19
-----------------------------
11. Дан массив A размера N и целое число K (1 <= K <= N).
Вывести элементы массива с порядковыми номерами, кратными
K: AK, A2·K, A3·K, ... .
 */
package com.company;
import java.util.Scanner;

public class Main {

    private static void FindMultiples(int[] array, int k) {
        //Поиск элементов кратных k + их печать
        System.out.println("Elements are multiples of K:");
        for(int j = 0; j < array.length; j++) {
            if (array[j] % k == 0 & array[j] != 0) { //поиск кратного элемента
                System.out.println(j + 1 + ") " + array[j]); //печать элемента и его номера
            }
        }
    }

    static void CreateArray(int[] array, int n) {
        // создание и печать массива
        System.out.println("Initial Array");
        for(int i = 0; i < n; i++) { //заполнение массива рандомом и его печать в консоль
                array[i] = (int)(Math.random()*((10-(-10))+1));
                System.out.print(array[i] + "  ");
            }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in); //настройка для ввода
        int n, k; //объявление переменных

        do { // цикл для записи размерности матрицы с проверкой по условию.
            System.out.println("Enter N: "); //размерность массива
            n = In.nextInt();
            System.out.println("Enter K (1 <= K <= N): "); //число K
            k = In.nextInt();
        } while(n <= 0 || k < 1 || k > n); //неотр N, K <= N, K >= 1

	    int[] array = new int[n];
	    CreateArray(array, n);
	    FindMultiples(array, k);
    }
}
