package Seminar_1.impl;
import java.time.LocalDate;

import Seminar_1.Product;


public class BottleOfWater extends Product {

    private float volume;
    private String pack; 
    private boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releasDate){
        super(name, price, releasDate);
        this.isSpark = false;
        this.volume = 1;
        this.pack = EPackage.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releasDate, boolean spark, String pack, float volume){
        super(name, price, releasDate);
        this.isSpark = false;
        this.volume = volume;
        this.pack = pack;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" + 
        "name='" + name + '\'' +
        ", price=" + price +
        ", releaseDate=" + releaseDate +
        "volume=" + volume +
        ", pack=" + pack + '\'' +
        ", isSpark=" + isSpark +
        '}';
    }

}