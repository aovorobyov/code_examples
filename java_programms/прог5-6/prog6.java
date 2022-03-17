/*
Vorobyov Alexander Olegovich,
1032193998, NFIbd-01-19
-----------------------------
36. Дан массив размера N. Найти максимальный из его элементов,
не являющихся ни локальным минимумом, ни локальным максимумом
(локальный минимум – это элемент, который меньше любого из
своих соседей; локальный максимум – это элемент, который
больше любого из своих соседей). Если таких элементов
в массиве нет, то вывести 0 (как вещественное число).
 */
package com.company;
import java.util.Scanner;
public class Main {

    private static void FindMaximum(int[] array) {
        //Поиск максимального элемента
        int max = -1, premax = -1; //объявляем переменные
        for(int j = 0; j < array.length; j++) {
            if (array[j] > premax) {
                premax = array[j]; //в предварительный макисмум записываем найденное значение
                if (j != 0 & j != array.length - 1) { //отсеиваем крайние элементы
                        if ((premax >= array[j-1] & premax <= array[j+1]) || //проверяем чтобы число не было
                                (premax >= array[j+1] & premax <= array[j-1])){ //локальным минимумом или максимумом
                        max = premax; //после проверки на условие присваиваем значение в итоговый максимум
                    }
                } else {
                    max = 0; //если такое значение не найдено, выводим ноль
                }
            }
        }
        System.out.println("Maximum is: " + max); //печать результата
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
        int n; //объявление переменой с размерностью

        do { // цикл для записи размерности матрицы с проверкой по условию.
            System.out.println("Enter N: "); //размерность массива
            n = In.nextInt();
        } while(n <= 0); //неотр N

        int[] array = new int[n];
        CreateArray(array, n);
        FindMaximum(array);
    }
}