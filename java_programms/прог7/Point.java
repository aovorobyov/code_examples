/*
1032193998, NFIbd-01-19
-----------------------------
Вариант 28
        – Объявить класс Point (точка) на плоскости.
        Точка задается декартовыми координатами.
        – Определить
            – конструктор с двумя действительными параметрами.
        – методы:
            - расстояние dist() от точки до начала координат
        – В методе main протестировать все методы.
 */
import java.util.Scanner;

public class Point {

    private int first, second; //определяем переменные для координаты точки

    public Point(int a, int b) {
        //конструктор
        this.first = a;
        this.second = b;
    }

    static double Dist(Point cat1) {
        //расстояние от начала координат до точки
        double dist = Math.sqrt(Math.pow(cat1.first, 2) +  Math.pow(cat1.second, 2));
    return dist;
    }

    public static void main(String[] args) {
        int f, s;
        Scanner In = new Scanner(System.in); //настройка для ввода

        do { // цикл для записи координат точки с проверкой по условию
            System.out.println("Enter first coordinate: ");
            f = In.nextInt();
            System.out.println("Enter second coordinate: ");
            s = In.nextInt();
        } while(f <= 0 || s <= 0); //неотр f и s

        Point firstp = new Point(f, s);

        System.out.println(firstp.Dist(firstp));
    }
}