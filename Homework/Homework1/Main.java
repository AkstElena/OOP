// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
// содержащий в себе методы initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
/*
1. В класс Beverage добавить поле объем (double volume), а в класс Food - масса (double weight), добавить заполнение в конструктор, добавтиь их в вывод toString()
2. Создать наследника класса Beverage ГорячийНапиток с дополнительным полем int температура.
3. Создать класс ГорячихНапитковАвтомат наследник от класса ТорговыйАвтомат и реализовать перегруженный метод getProduct(String name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
4. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 */

package Homework.Homework1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    // Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10,
    // 10, 0, 0), 15);
    // Product product2 = new Beverage("Pepsi", 90, 50, new GregorianCalendar(2024,
    // 10, 10, 0, 0), 0.5);
    // Product product3 = new HotBeverage("Cappuccino", 150, 5, new
    // GregorianCalendar(2023, 7, 20, 0, 0), 0.5, 80);

    // Automat list = new Automat();
    // List<Product> myList = new ArrayList<>();
    // myList.add(product1);
    // myList.add(product2);
    // myList.add(product3);
    // list.initProduct(myList);

    // String name1 = "Twix";
    // String name2 = "Pepsi";
    // String name3 = "Cappuccino";

    // System.out.println(list.getProduct(name1).toString());
    // System.out.println(list.getProduct(name2).toString());
    // System.out.println(list.getProduct(name3).toString());

    HotBeverageAutomat hbAutomat = new HotBeverageAutomat();

    HotBeverage beverageProduct1 = new HotBeverage("Espresso", 100, 12, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
        80);
    HotBeverage beverageProduct2 = new HotBeverage("Latte", 200, 10, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8, 60);
    HotBeverage beverageProduct3 = new HotBeverage("Cappuccino", 150, 5, new GregorianCalendar(2023, 7, 20, 0, 0), 0.5,
        80);
    HotBeverage beverageProduct4 = new HotBeverage("Glasse", 210, 18, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8,
        50);
    HotBeverage beverageProduct5 = new HotBeverage("Americano", 100, 13, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
        80);

    List<HotBeverage> myList = new ArrayList<>();
    myList.add(beverageProduct1);
    myList.add(beverageProduct2);
    myList.add(beverageProduct3);
    myList.add(beverageProduct4);
    myList.add(beverageProduct5);
    hbAutomat.initHotBeverage(myList);

    String name = "Cappuccino";
    Double volume = 0.5;
    Integer temperature = 80;

    System.out.println(hbAutomat.getProduct(name, volume, temperature).toString());

  }
}
