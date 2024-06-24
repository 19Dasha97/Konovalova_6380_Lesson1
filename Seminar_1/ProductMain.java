package Seminar_1;

import java.time.LocalDate;
import java.util.List;

import Seminar_1.impl.BottleOfWater;
import Seminar_1.impl.EPackage;
import Seminar_1.impl.HotDrinkVendingMachine;
import Seminar_1.impl.WaterVendingMachine;

public class ProductMain {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1), 
        true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

        Product bottle1 = new HotDrinkVendingMachine("Родники", 55, LocalDate.of(2024, 5, 1));

        // Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1), 
        // true, EPackage.GLASS.getMaterial(), 0.5F);
        
    }
}
