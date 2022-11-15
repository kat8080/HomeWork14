import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 2015, "России", "желтого",250, 1.7f,
                "автомат", "универсал", "А125ДЛ564", "5", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 2500.0f, "456789321"));
        System.out.println(lada);
        lada.isRegNumberValid(lada.getRegistrationNumber());
        lada.setSeasonTires();
        Car.Insurance.isInsuranceValid(LocalDate.now());



        Car audi = new Car("Audi","A8 50 L TDI quattro",2020,"Германии","черного", 300,3.0f,
                "автомат", "хэчбэк", "А125ДЛ565", "5", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(4), 2500.0f, "454615411"));
        System.out.println(audi);
        audi.isRegNumberValid(audi.getRegistrationNumber());
        audi.setSeasonTires();
        Car.Insurance.isInsuranceValid(LocalDate.now());

        Car bmv = new Car("BMW","Z8o",2021,"Германии","черного",350,3.0f,
                "автомат", "хэчбэк", "А125ДЛ566", "5", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 2500.0f, "456789323"));

        Car kia = new Car("Kia","Sportage 4-го поколения",2018,"Южной Корее","красного",250,2.4f,
                "автомат", "седан", "А125ДЛ567", "5", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 2500.0f, "456789324"));

        Car hyundai = new Car("Hyundai","Avante",2016,"Южной Корее","оранжевого",300,1.6f,
                "автомат", "минивэн", "А125ДЛ568", "8", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 2500.0f, "456789325"));


    }
}