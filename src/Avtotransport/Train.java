package Avtotransport;

import Avtotransport.Tasks;

public class Train extends Transport {
    private int priceTrip;            //Цена поездки
    private String travelTime;           //Время поездки
    private String startStation;         //Название станции отбытия
    private String lastStation;           //Конечная остановка
    private int quantityWagons;           //Количество вагонов

    public Train(String brand, String model, int year, String country, String color, int maxSpeed,
                 int priceTrip, String travelTime, String startStation, String lastStation, int quantityWagons, String fuel) {
        super(brand, model, year, country, color, maxSpeed, fuel);
        setPriceTrip(priceTrip);
        setTravelTime(travelTime);
        setStartStation(startStation);
        setLastStation(lastStation);
        setQuantityWagons(quantityWagons);
    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        this.priceTrip = Tasks.check(priceTrip,500);
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = Tasks.validOrDefault(travelTime, "default");
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = Tasks.validOrDefault(startStation, "default");
    }

    public String getLastStation() {
        return lastStation;
    }

    public void setLastStation(String lastStation) {
        this.lastStation = Tasks.validOrDefault(lastStation, "default");
    }

    public int getQuantityWagons() {
        return quantityWagons;
    }

    public void setQuantityWagons(int quantityWagons) {
        this.quantityWagons = Tasks.check(year, 1);
    }

    @Override
    public String toString() {
        return "Поезд " + brand + ", модель " + model + ", " + year + " год выпуска в " + country + ", цвет " + color +
                ", скорость передвижения - " + maxSpeed + " км/ч, отходит от " + startStation + " и следует "
                + lastStation + ". Цена поездки - " + priceTrip + " рублей, время поездки - " + travelTime +
                " ч., в поезде " + quantityWagons + " вагонов.";
        //(String brand, String model, int year, String country, String color, int maxSpeed,
        //                 int priceTrip, String travelTime, String startStation, String lastStation, int quantityWagons)
    }

    @Override
    public void refill() {
        System.out.println("Заправлять - " + fuel);
    }
}
