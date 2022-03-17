/*
Vorobyov Alexander Olegovich,
1032193998, NFIbd-01-19
-----------------------------
36. Table содержащий следующие поля: страна производитель стола;
высота стола; материал, из которого изготовлен; цена.
 */
import java.util.Scanner;
public class Table {
    private String Country, Material, Colour; //переменные
    private double Height, Price;
    static public int n = 6;

    public Table(String C, String M, double H, double P, String Cr) { //конструктор1
        this.Country = C;
        this.Material = M;
        this.Height = H;
        this.Price = P;
        this.Colour = Cr;
    }

    public Table() { //конструктор2
        this.Country = "Russia";
        this.Material = "Chipboard";
        this.Height = 75;
        this.Price = 16190;
        this.Colour = "Gray";
    }

    static void FindDomestic(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) { //поиск столов отечественного производства
        String[] array;
        array = new String[n]; //массив с данными о стране производителя
        array[0] = t1.Country; array[1] = t2.Country; array[2] = t3.Country; //присваиваем данные
        array[3] = t4.Country; array[4] = t5.Country; array[5] = t6.Country;

        for(int i = 0; i < n; i++) { // находим совпадения со страной производства Russia
            if (array[i] == "Russia") {
                System.out.println("Table " + (i+1) + " is domestic");
            }
        }
    }

    static void FindForeign(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) { //поиск столов зарубежного производства
        String[] array;
        array = new String[n]; //массив с данными о стране производителя
        array[0] = t1.Country; array[1] = t2.Country; array[2] = t3.Country; //присваиваем данные
        array[3] = t4.Country; array[4] = t5.Country; array[5] = t6.Country;

        for(int i = 0; i < n; i++) { // находим совпадения со страной производства Russia
            if (array[i] != "Russia") {
                System.out.println("Table " + (i+1) + " is foreign");
            }
        }
    }

    static void FindTallest(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) { //поиск самого высокого стола
        double max = 0; //переменная для записи максимума
        double[] array2; //массив с данными о высоте столов
        array2 = new double[n];
        array2[0] = t1.Height; array2[1] = t2.Height; array2[2] = t3.Height; //присваиваем данные
        array2[3] = t4.Height; array2[4] = t5.Height; array2[5] = t6.Height;

        for (int j = 0; j < n; j++) { // находим максимальное значение параметра height
            if (array2[j] > max) {
                max = array2[j];
            }
        }
        System.out.println("The tallest table is " + max + " cm");
    }

    static void FindLowest(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) { //поиск самого высокого стола
        double min = 1000; //переменная для записи максимума
        double[] array2; //массив с данными о высоте столов
        array2 = new double[n];
        array2[0] = t1.Height; array2[1] = t2.Height; array2[2] = t3.Height; //присваиваем данные
        array2[3] = t4.Height; array2[4] = t5.Height; array2[5] = t6.Height;

        for (int j = 0; j < n; j++) { // находим максимальное значение параметра height
            if (array2[j] < min) {
                min = array2[j];
            }
        }
        System.out.println("The lowest table is " + min + " cm");
    }

    static void FindCheapest(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) { //поиск самого дешевого стола
        double min = 100000; //переменная для записи минимума
        double[] price; //массив с данными о цене столов
        price = new double[n];
        price[0] = t1.Price; price[1] = t2.Price; price[2] = t3.Price; //присваиваем данные
        price[3] = t4.Price; price[4] = t5.Price; price[5] = t6.Price;

        for (int u = 0; u < n; u++) { //находим наименьшее значение параметра price
            if (price[u] < min) {
                min = price[u];
            }
        }
        System.out.println("The cheapest table costs " + min + " Rub");
    }

    static void FindMostExpensive(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) { //поиск самого дешевого стола
        double max = 0; //переменная для записи минимума
        double[] price; //массив с данными о цене столов
        price = new double[n];
        price[0] = t1.Price; price[1] = t2.Price; price[2] = t3.Price; //присваиваем данные
        price[3] = t4.Price; price[4] = t5.Price; price[5] = t6.Price;

        for (int u = 0; u < n; u++) { //находим наименьшее значение параметра price
            if (price[u] > max) {
                max = price[u];
            }
        }
        System.out.println("The most expensive table costs " + max + " Rub");
    }

    static void TemplatePrinting(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) { //печать товаров по шаблону
        String[] material; //массив с данными о материалах стола
        material = new String[n];
        material[0] = t1.Material; material[1] = t2.Material; material[2] = t3.Material; //присваиваем данные
        material[3] = t4.Material; material[4] = t5.Material; material[5] = t6.Material;

        double[] array2; //массив с данными о высоте столов
        array2 = new double[n];
        array2[0] = t1.Height; array2[1] = t2.Height; array2[2] = t3.Height; //присваиваем данные
        array2[3] = t4.Height; array2[4] = t5.Height; array2[5] = t6.Height;

        String[] array;
        array = new String[n]; //массив с данными о стране производителя
        array[0] = t1.Country; array[1] = t2.Country; array[2] = t3.Country; //присваиваем данные
        array[3] = t4.Country; array[4] = t5.Country; array[5] = t6.Country;

        double[] price; //массив с данными о цене столов
        price = new double[n];
        price[0] = t1.Price; price[1] = t2.Price; price[2] = t3.Price; //присваиваем данные
        price[3] = t4.Price; price[4] = t5.Price; price[5] = t6.Price;

        for (int a = 0; a < n; a++) {
            System.out.println(material[a] + " table " + array2[a] + "cm from " + array[a] + " costs " + price[a] + " Rub.");
        }
    }

    static void SameColour(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) {
        String[] colour;
        colour = new String[n];
        colour[0] = t1.Colour; colour[1] = t2.Colour; colour[2] = t3.Colour;
        colour[3] = t4.Colour; colour[4] = t5.Colour; colour[5] = t6.Colour;

        for (int o = 0; o < n-1; o++) {
            for (int e = o+1; e < n; e++) {
                if ((colour[o] == colour[e]) & (o != e)) {
                    System.out.println("Table " + (o+1) + " and " + (e+1) + " have the same colour: " + colour[o] + ".");
                }
            }
        }
    }

    static void SameCountry(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) {
        String[] country;
        country = new String[n]; //массив с данными о стране производителя
        country[0] = t1.Country; country[1] = t2.Country; country[2] = t3.Country; //присваиваем данные
        country[3] = t4.Country; country[4] = t5.Country; country[5] = t6.Country;

        for (int o = 0; o < n-1; o++) {
            for (int e = o+1; e < n; e++) {
                if ((country[o] == country[e]) & (o != e)) {
                    System.out.println("Table " + (o+1) + " and " + (e+1) + " are from " + country[o] + ".");
                }
            }
        }
    }

    static void WhichHigher(Table t1, Table t2) {
        if (t1.Height > t2.Height) {
            System.out.println("First table is higher than the second.");
        } else {
            System.out.println("Second table is higher than the first.");
        }
    }

    static void PriceDifference(Table t1, Table t2) {
        if (t1.Price > t2.Price) {
            double difp = t1.Price - t2.Price;
            System.out.println("The first table is " + difp + " Rub more expensive than the second.");
        } else {
            double difm = t2.Price - t1.Price;
            System.out.println("The first table is " + difm + " Rub cheaper than the second.");
        }
    }

    static void SalePrice20(Table t1, Table t2, Table t3, Table t4, Table t5, Table t6) {
        double[] price; //массив с данными о цене столов
        price = new double[n];
        price[0] = t1.Price; price[1] = t2.Price; price[2] = t3.Price; //присваиваем данные
        price[3] = t4.Price; price[4] = t5.Price; price[5] = t6.Price;

        for (int y = 0; y < n; y++) {
            double sprice = price[y] * 0.8;
            System.out.println("20% discount price for table " + (y+1) + ": " + Math.ceil(sprice) + " Rub.");
        }
    }

    public static void main(String[] args) {
        //заполнение данных о столах
        Table table1 = new Table("Russia", "Chipboard", 75.1, 7490, "White");
        Table table2 = new Table("China", "Aluminum", 47, 6999, "Black");
        Table table3 = new Table("Sweden", "Wood", 70, 14590, "White");
        Table table4 = new Table("China", "Glass", 65.5, 8999, "Black");
        Table table5 = new Table("Sweden", "Rock", 84, 19990, "Gray");
        Table table6 = new Table();

        FindDomestic(table1, table2, table3, table4, table5, table6); //Стол(ы) отечественного производства
        FindForeign(table1, table2, table3, table4, table5, table6); //Стол(ы) зарубежного производства
        FindTallest(table1, table2, table3, table4, table5, table6); //самый высокий стол
        FindLowest(table1, table2, table3, table4, table5, table6); //самый низкий стол
        FindCheapest(table1, table2, table3, table4, table5, table6); //самый дешевый стол
        FindMostExpensive(table1, table2, table3, table4, table5, table6); //самый дорогой стол
        TemplatePrinting(table1, table2, table3, table4, table5, table6); //Шаблонная печать
        SameColour(table1, table2, table3, table4, table5, table6); //столы с одинаковыми цветами
        SameCountry(table1, table2, table3, table4, table5, table6); //столы произведенные в одной стране
        WhichHigher(table3, table4); //какой из двух столов выше
        PriceDifference(table5, table6); //разница в цене между двумя столами
        SalePrice20(table1, table2, table3, table4, table5, table6); //стоимость столов со скидкой 20%
    }
}
