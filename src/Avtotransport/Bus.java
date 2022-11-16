package Avtotransport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, String fuel) {
        super(brand, model, year, country, color, maxSpeed, fuel);
    }

    @Override
    public void refill() {
        System.out.println("Заправлять - " + fuel);
    }


    @Override
    public String toString() {
        return "Автобус: " + brand + " " + model + ", " + year +
                " года выпуска, сборка в " + country +
                ", " + color + " цвета, максимальная скорость - " + maxSpeed + " км/ч.";
    }
}
