package Seminar_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Seminar_1.impl.BottleOfWater;
import Seminar_1.impl.EPackage;
import Seminar_1.impl.HotDrink;
import Seminar_1.impl.HotDrinkVendingMachine;
import Seminar_1.impl.WaterVendingMachine;

public class ProductMain {
    public static void main(String[] args) {
        // Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        // Product bottle2 = new BottleOfWater("Родники Газированная", 55,
        // LocalDate.of(2024, 5, 1),
        // true, EPackage.GLASS.getMaterial(), 0.5F);

        // VendingMachine vm = new WaterVendingMachine();

        // System.out.println(vm.getProducts());

        // vm.addProducts(List.of(bottle1, bottle2, Drink1, Drink2));

        // System.out.println(vm.getProducts());

        // vm.getProduct("Родники");

        // System.out.println(vm.getProducts());

        Product Drink1 = new HotDrink("tea", 10, LocalDate.of(2024, 6, 12));
        Product Drink2 = new HotDrink("cofee", 15, LocalDate.of(2024, 6, 13), 30, 1);

        VendingMachine HVM = new HotDrinkVendingMachine();

        System.out.println(HVM.getProducts());

        HVM.addProducts(List.of(Drink1, Drink2));

        System.out.println(HVM.getProducts());

        HVM.getProduct("cofee", 1, 30);

        System.out.println(HVM.getProducts());


       }
}
