/*
Vorobyov Alexander Olegovich,
1032193998, NFIbd-01-19
-----------------------------
36. Table содержащий следующие поля: страна производитель стола;
высота стола; материал, из которого изготовлен; цена.
 */
import java.util.Scanner;
public class Table {
    private String Country, Material; //переменные
    private double Height, Price;

    public Table(String C, String M, double H, double P) { //конструктор1
        this.Country = C;
        this.Material = M;
        this.Height = H;
        this.Price = P;
    }

    public Table() { //конструктор2
        this.Country = "Russia";
        this.Material = "Chipboard";
        this.Height = 75;
        this.Price = 16190;
    }

    static void FindDomestic(String C1, String C2, String C3, //поиск столов отечественного производства
                             String C4, String C5, String C6) {
        String[] array;
        array = new String[6]; //массив с данными о стране производителя
        array[0] = C1; //присваиваем данные
        array[1] = C2;
        array[2] = C3;
        array[3] = C4;
        array[4] = C5;
        array[5] = C6;
        for(int i = 0; i < 6; i++) { // находим совпадения со страной производства Russia
            if (array[i] == "Russia") {
                System.out.println("Table " + (i+1) + " is domestic");
            }
        }
    }
    static void FindTallest(double H1, double H2, double H3, //поиск самого высокого стола
                            double H4, double H5, double H6) {
        double max = 0; //переменная для записи максимума
        double[] array2; //массив с данными о высоте столов
        array2 = new double[6];
        array2[0] = H1; //присваиваем данные
        array2[1] = H2;
        array2[2] = H3;
        array2[3] = H4;
        array2[4] = H5;
        array2[5] = H6;
        for (int j = 0; j < 6; j++) { // находим максимальное значение
            if (array2[j] > max) {
                max = array2[j];
            }
        }
        System.out.println("The tallest table is " + max + " cm");
    }

    public static void main(String[] args) {
        //заполнение данных о столах
        Table table1 = new Table("Russia", "Chipboard", 75.1, 7490);
        Table table2 = new Table("China", "Aluminum", 47, 6999);
        Table table3 = new Table("Sweden", "Wood", 70, 14590);
        Table table4 = new Table("China", "Glass", 65.5, 8999);
        Table table5 = new Table("Sweden", "Rock", 84, 19990);
        Table table6 = new Table();

        FindDomestic(table1.Country, table2.Country, table3.Country, //Стол(ы) отечественного
                table4.Country, table5.Country, table6.Country); //производства
        FindTallest(table1.Height, table2.Height, table3.Height, //Самый высокий стол
                table4.Height, table5.Height, table6.Height);
    }
}
