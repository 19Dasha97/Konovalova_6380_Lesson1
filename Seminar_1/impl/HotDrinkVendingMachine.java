// Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
// � перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
// соответствующий имени, объему и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
// воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре


package Seminar_1.impl;

import java.util.List;

import Seminar_1.Product;
import Seminar_1.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine{
    public HotDrinkVendingMachine() {
        super();
    }
    public HotDrinkVendingMachine (List<Product> products) {
        super (products);
    }

        // реализовать перегруженный метод getProduct выдающий продукт соответствующий имени, объему, температуре.

    public Product getProduct(String name, int volume, int temp){
        for (HotDrink product : HotDrinkVendingMachine) {
            if (product.getName().equals(name)&& product.getVolume().equals(volume) && product.getTemperature().equals(temperature)) {
                products.remove(product);
                return product;
            }
        }
        System.out.println("No such product" + name);
        return null;
    }

}
