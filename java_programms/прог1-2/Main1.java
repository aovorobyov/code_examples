/*
Vorobyov Alexander Olegovich,
1032193998, NFIbd-01-19
-----------------------------
В массиве из 10 чисел есть положительные и отрицательные
элементы. Вычислить произведение положительных элементов массива.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
	    final int n = 10; //размерность массива в константу
	    int Comp = 1; //переменная под произведение эл-тов
	    int[] mass = new int[n]; //объявление массива
	    for(int i = 0; i < mass.length; i++) { //заполнение массива
	        mass[i] = (-10) + (int)(Math.random()*((10-(-10))+1));
    }
        for(int i = 0; i < n; i++) {
            if (mass[i] > 0) { //поиск положительных чисел
                Comp = Comp * mass[i]; //перемножение эл-тов в переменную
            }
        }
        for(int i = 1; i < n; i++){ //цикл для печати массива
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    System.out.print(Comp); //вывод произведения
    }
}
