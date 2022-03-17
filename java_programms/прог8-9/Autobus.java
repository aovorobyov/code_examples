/*
Vorobyov Alexander Olegovich,
1032193998, NFIbd-01-19
-----------------------------
11. Autobus содержащий следующие поля: название начального пункта;
название конечного пункта; номер маршрута; время поездки
 */
import java.util.Scanner;
public class Autobus {
    private String StartPoint, FinalPoint; //переменные для назв. нач. и кон. пунктов
    private int RouteNum; //переменные с номером маршрута
    private double TravelTime; //и его длительностью

    public Autobus(String SP, String FP, int RN, double TT) { //конструктор1
        this.StartPoint = SP;
        this.FinalPoint = FP;
        this.RouteNum = RN;
        this.TravelTime = TT;
    }

    public Autobus() { //конструктор2
        this.StartPoint = "Moscow";
        this.FinalPoint = "Kazan";
        this.RouteNum = 1015;
        this.TravelTime = 12.15;
    }

    static void TimeDifference(double TT1, double TT2) { //разница в продолжит. поездок
        double TD = Math.abs(TT1 - TT2); //вычисляем модуль разницы
        System.out.println("Difference in trip: " + TD + " hour(s)");
    }

    static void ShortestTrip(double TT1, double TT2, double TT3, double TT4, double TT5, double TT6) {
        //поиск самой короткой по времени поездки
        double min = 1000; //переменная для минимума
        double[] array; //массив с данными о длитльности поездок
        array = new double[6];
        array[0] = TT1; //присваиваем данные
        array[1] = TT2;
        array[2] = TT3;
        array[3] = TT4;
        array[4] = TT5;
        array[5] = TT6;
        for(int i = 0; i < 6; i++) { //через цикл находим кратчайшую поездку
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The shortest trip lasts " + min + " hour(s)");
    }

    public static void main(String[] args) {

        //заполнение данных об автобусах
        Autobus autobus1 = new Autobus("Moscow", "Kiev", 560, 10.9);
        Autobus autobus2 = new Autobus("Moscow", "Minsk", 915, 7.9);
        Autobus autobus3 = new Autobus("Moscow", "Sevastopol", 440, 20.5);
        Autobus autobus4 = new Autobus("Moscow", "Saint-Petersburg", 685, 7.5);
        Autobus autobus5 = new Autobus("Moscow", "Arkhangelsk", 590, 7.4);
        Autobus autobus6 = new Autobus();

        TimeDifference(autobus1.TravelTime, autobus2.TravelTime); //разница во времени между поездками
        ShortestTrip(autobus1.TravelTime, autobus2.TravelTime, autobus3.TravelTime, //самая короткая по времени поездка
                autobus4.TravelTime, autobus5.TravelTime, autobus6.TravelTime);
    }
}
