public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус: " + brand + model + ", " + year +
                " года выпуска, сборка в " + country +
                ", " + color + " цвета, максимальная скорость - " + maxSpeed + " км/ч.";
    }
}
