package Seminar_1.impl;

import Seminar_1.Product;
import Seminar_1.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine{

    public Product getProduct(String name, double price,double volume, int temperature){
        return new HotDrink(name, price,volume, temperature);
    }
}