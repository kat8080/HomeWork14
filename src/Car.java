import java.time.LocalDate;

public class Car extends Transport{

        public static class Key {          //вложенный класс Ключ
            private final boolean remoteEngineStart;  //Удаленный запуск двигателя
            private final boolean keyLessAccess;     //Бесключевой доступ

            public Key(boolean remoteEngineStart, boolean keyLessAccess) {
                this.remoteEngineStart = remoteEngineStart;
                this.keyLessAccess = keyLessAccess;
            }

            public boolean isRemoteEngineStart() {
                return remoteEngineStart;
            }

            public boolean isKeyLessAccess() {
                return keyLessAccess;
            }

            @Override
            public String toString() {
                return "Запуск двигателя:  " +
                        "remoteEngineStart=" + remoteEngineStart +
                        ", keyLessAccess=" + keyLessAccess ;
            }
        }

        public static class Insurance {         //вложенный класс Страховка
            private final LocalDate validUntil;  //Срок действия
            private final float cost;             //Стоимость
            private final String namber;        //номер

            public Insurance(LocalDate validUntil, float cost, String namber) {
                this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
                this.cost = Math.max(cost, 1f);
                this.namber = Tasks.validOrDefault(namber, "default");
            }

            public boolean isNumberValid() {
                return namber.length() == 9;         //проверка длины номера страховки
            }

            public static void isInsuranceValid(LocalDate validUntil) {                  //проверка действительности страховки
                if (!LocalDate.now().isBefore(validUntil)) {
                    System.out.println("Страховка действительна");
                }else System.out.println("Срок действия страховки истек");
            }

            @Override
            public String toString() {
                return "Страховка: " +
                        " срок действия " + validUntil +
                        ", стоимость " + cost +
                        ", номер " + namber ;
            }
        }

        private Float engineVolume;    //объем двигателя
        private String transmission;       //коробка передач
        private final String bodyType;              //Тип кузова          не изменяется
        private String registrationNumber;        //Регистрационный номер
        private final String numberSeats;          //Количество мест       не изменяется
        private String tires;          //зимаШины
        private Key key;
        private Insurance insurance;

        public Car(String brand, String model, int year, String country, String color, int maxSpeed, Float engineVolume,
                   String transmission, String bodyType, String registrationNumber, String numberSeats,
                   String tires, Key key, Insurance insurance, String fuel) {
            super(brand, model, year, country, color, maxSpeed, fuel);
            setEngineVolume(engineVolume);
            this.bodyType = Tasks.validOrDefault(bodyType, "default");
            this.numberSeats = Tasks.validOrDefault(numberSeats, "default");
            setTransmission(transmission);
            setRegistrationNumber(registrationNumber);
            setTires(tires);
            this.key = key;
            this.insurance = insurance;
        }

        public String getBodyType() {
            return bodyType;
        }

        public String getNumberSeats() {
            return numberSeats;
        }

        public Float getEngineVolume() {
            return engineVolume;
        }

        public void setEngineVolume(Float engineVolume) {
            this.engineVolume = engineVolume >= 0.0f ? engineVolume : 1.5f;
        }

        public String getTransmission() {
            return transmission;
        }

        public void setTransmission(String transmission) {
            this.transmission = Tasks.validOrDefault(transmission, "default");
        }

        public String getTires() {
            return tires;
        }

        public void setTires(String tires) {
            this.tires = Tasks.validOrDefault(tires, "default");
        }

        public void setSeasonTires() {                                         //замена шин в зависимости от месяца
            int currentMonth = LocalDate.now().getMonthValue();              //текущий месяц
            if (currentMonth <= 4 || currentMonth >= 11) {
                System.out.println("Зимняя резина");
            } else System.out.println("Летняя резина");
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public void setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public static boolean isRegNumberValid(String registrationNumber) {                        //проверка регНомера
            if (registrationNumber.length() != 9) {                   //длина номера не больше 9
                System.out.println("Регистрационный номер не верный");
            } else System.out.println("Регистрационный номер верный");

            char[] registrationNumberChars = registrationNumber.toCharArray();   //проверка каждого символа
            return isRegNumberLetter(registrationNumberChars[0])                      //соответствие цифре или букве
                    && isNamber(registrationNumberChars[1])
                    && isNamber(registrationNumberChars[2])
                    && isNamber(registrationNumberChars[3])
                    && isRegNumberLetter(registrationNumberChars[4])
                    && isRegNumberLetter(registrationNumberChars[5])
                    && isNamber(registrationNumberChars[6])
                    && isNamber(registrationNumberChars[7])
                    && isNamber(registrationNumberChars[8]);
        }

        private static boolean isNamber(char symbol) {          //проверка на цифру
            return Character.isDigit(symbol);
        }


        private static boolean isRegNumberLetter(char symbol) {        //проверка на букву
            String allowedSymbols = "АВЕКМНОРСТУХ";
            return allowedSymbols.contains("" + symbol);  //contains проверяет находится ли подстрока в строке
        }

        public Key getKey() {
            return key;
        }

        public Insurance getInsurance() {
            return insurance;
        }

    @Override
    public void refill() {
        System.out.println("Заправлять - " + fuel);
    }

    @Override
        public String toString() {
            System.out.println(key);
            System.out.println(insurance);
            return "Автомобиль:  " + brand + " " + model + ", " + year + " год выпуска, сборка  в "
                    + country + ", " + color + " цвета," + " максимальная скорость " + maxSpeed +" км/ч., " + " объем двигателя — " + engineVolume + " л." + ", " +
                    " Коробка передач " + transmission + ", " + " Тип кузова " + bodyType + ", " + " Регистрационный номер "
                    + registrationNumber + ", " + " Количество мест " + numberSeats + ", " + " Резина " + tires;

        }
}
