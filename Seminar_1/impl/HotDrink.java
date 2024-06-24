package Seminar_1.impl;

import java.time.LocalDate;

import Seminar_1.Product;

public class HotDrink extends Product {
    public int temperature;
    public int volume;

    public HotDrink(String name, double price, LocalDate releaseDate){  
        super(name, price, releaseDate);
        this.temperature = 0;
        this.volume = 1;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, int volume){  
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
    }


    public int getTemperature() {
        return temperature;
    }

    public int getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return "BottleOfWater{" + 
        "name='" + name + '\'' +
        ", price=" + price +
        ", releaseDate=" + releaseDate +
        ", temperature=" + temperature +
        '}';

    }
}
