package transport;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {

    public class Key {
        private boolean remoteEngineStart;
        private boolean keyless;

        public Key(boolean remoteEngineStart, boolean keyless) {
            this.remoteEngineStart = remoteEngineStart;
            this.keyless = keyless;

        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeyless() {
            return keyless;
        }

        @Override

        public String toString() {
                return (isRemoteEngineStart() ? "\tУдаленный запуск двигателя: есть\n" : "\tУдаленный запуск двигателя: нет\n") + (isKeyless() ? "\tБесключевой доступ: есть\n" : "\tБесключевой доступ: нет\n");
        }
    }

    public class Insurance {
        private Date validity;
        private double cost;
        private String number;

        public Insurance(String validity, double cost, String number) throws ParseException {

            String modValidity = validity.replaceAll("\\p{Punct}|\\p{Space}", ".");
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            if (validity == null || validity.isEmpty() || validity.isBlank()) {
                this.validity = formatter.parse("01.01.1900");
            } else if (Pattern.matches("\\d{2}[.]\\d{2}[.]\\d{4}", modValidity)) {
                this.validity = formatter.parse(modValidity);
            }


            if (cost >= 0) this.cost = cost;
            else this.cost = 0;

            if (number == null || number.isEmpty() || number.isBlank()) {
                this.number = "Номер не указан";
            } else this.number = number;
        }

        public Date getValidity() {
            return validity;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        private String checkValidity() {
            String ANSI_RESET = "\u001b[0m";
            String ANSI_RED = "\u001b[31m";
            Date now = new Date();
            if (getValidity().before(now)) return  ANSI_RED + "  ПОЛИС ПРОСРОЧЕН!!!" + ANSI_RESET;
            else return "";
        }

        private String checkNumber() {
            String ANSI_RESET = "\u001b[0m";
            String ANSI_RED = "\u001b[31m";
            if (Pattern.matches("[0-9a-zA-Z]{9}", getNumber())) return "";
            else return ANSI_RED + " НЕКОРРЕКТНЫЙ НОМЕР!!!" + ANSI_RESET;
        }


        @Override
        public String toString() {
            String ANSI_RESET = "\u001b[0m";
            String ANSI_RED = "\u001b[31m";
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            return "\tНомер: " + getNumber() + checkNumber() + "\n" +
                    "\tСрок действия: " + (validity != null ? formatter.format(getValidity()) + checkValidity() + "\n" : ANSI_RED +" НЕКОРРЕКТНАЯ ДАТА!!!\n" + ANSI_RESET) +
                    "\tСтраховая премия: " + getCost();
        }
    }
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seats;
    private String tires;

    private Key key;

    private Insurance insurance;


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String regNumber, int seats, String tires) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume= engineVolume;
        }

        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        this.color = color;

        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        String modRegNumber = regNumber.replace(" ","");
        modRegNumber = modRegNumber.toUpperCase();
        boolean correctNum = false;
        if (Pattern.matches("[авекмнорстухАВЕКМНОРСТУХ]\\d{3}[авекмнорстухАВЕКМНОРСТУХ]{2}\\d{2,3}", modRegNumber)) {
            this.regNumber = modRegNumber;
        } else {
            this.regNumber = "Некорректно указан г/н";
        }

        if (tires == null || tires.isEmpty() || tires.isBlank()) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }

        if (seats <= 1) {
            this.seats = 2;
        } else {
            this.seats = seats;
        }
    }


    @Override

    public String toString() {
        return brand + " " + model + "\n" +
                "Год выпуска: " + year + "\n" +
                "Cтрана сборки: " + country + "\n" +
                "Цвет: " + color + "\n" +
                "Объем двигателя: " + engineVolume + " л.\n" +
                "Трансмиссия: " + transmission + "\n" +
                "Кузов: " + bodyType + "\n" +
                "г/н: " + regNumber + "\n" +
                "Сидячих мест: " + seats + "\n" +
                "Сезонность шин: " + tires + "\n" +
                "Ключ: \n" + (key != null ? key : "\tИнформации о ключе отсутствует") +
                "ОСАГО: \n" + (insurance != null ? insurance : "\tИнформации об ОСАГО отсутствует");
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getSeats() {
        return seats;
    }

    public String getTires() {
        return tires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setKey(Key key) {
        if (this.key == null)
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color != null || !color.isEmpty() || !color.isBlank()) {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission != null || !transmission.isEmpty() || !transmission.isBlank()) {
            this.transmission = transmission;
        }
    }

    public void setRegNumber(String regNumber) {
        if (regNumber != null || !regNumber.isEmpty() || !regNumber.isBlank()) {
            this.regNumber = regNumber;
        }
    }

    public void setTires(String tires) {
        if (tires != null || !tires.isEmpty() || !tires.isBlank()) {
            this.tires = tires;
        }
    }

    public void changeTires() {
        if (this.tires.equalsIgnoreCase("Зимняя")) {
            setTires("Летняя");
        } else if (this.tires.equalsIgnoreCase("Летняя")) {
            setTires("Зимняя");
        } else {
            setTires("Некорректные данные");
        }
    }
}
