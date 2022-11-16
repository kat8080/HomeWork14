package Avtotransport;

import Avtotransport.Tasks;

public abstract class Transport {
    public final String brand;         //марка
    public final String model;
    public final int year;               //год производства
    public final String country;        //производитель
    public String color;
    public int maxSpeed;           //макс скорость
    public final String fuel;       //топливо

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, String fuel) {
        this.brand = Tasks.validOrDefault(brand,"default");
        this.model = Tasks.validOrDefault(model,"default");
        this.year = Tasks.check(year, 2000);
        this.country = Tasks.validOrDefault(country,"default");
        this.fuel = Tasks.validOrDefault(fuel, "default");
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Tasks.validOrDefault(color,"default");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Tasks.check(maxSpeed, 200);
    }

    public String getFuel() {
        return fuel;
    }

    public abstract void refill();
}
