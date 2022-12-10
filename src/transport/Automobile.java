package transport;

import values.ValidateUtils;

import java.time.LocalDate;

public class Automobile {

    public static class Key {
        private final String remoteStart;
        private final String keylessAccess;

        public Key(String remoteStart, String keylessAccess) {
            this.remoteStart = ValidateUtils.validateString(remoteStart);
            this.keylessAccess = ValidateUtils.validateString(keylessAccess);
        }

        @Override
        public String toString() {
            return "Key{" + "remoteStart='" + remoteStart + '\'' + ", keylessAccess='" + keylessAccess + '\'' + '}';
        }
    }

    public static class Insurance {
        private final LocalDate duration;
        private final double cost;
        private final String number;

        public Insurance(LocalDate duration, double cost, String number) {
            this.duration = ValidateUtils.checkDuration(duration);
            this.cost = ValidateUtils.validateDouble(cost);
            this.number = ValidateUtils.validateInsNumber(number);
        }
    }

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String carBody;
    private String regNumber;
    private final int seats;
    private boolean winterTires;
    private boolean summerTires;

    public Automobile(String brand, String model, int year, String country, String color, double engineVolume, String transmission, String carBody, int seats, String regNumber) {
        this.brand = ValidateUtils.validateCarParameters(brand);
        this.model = ValidateUtils.validateCarParameters(model);
        this.year = ValidateUtils.validateYear(year);
        this.country = ValidateUtils.validateCarParameters(country);
        this.color = ValidateUtils.validateCarColor(color);
        this.engineVolume = ValidateUtils.validateDouble(engineVolume);
        this.transmission = ValidateUtils.validateCarParameters(transmission);
        this.carBody = carBody;
        this.seats = seats;
        this.regNumber = ValidateUtils.validateRegNumber(regNumber);
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

    public String getCarBody() {
        return carBody;
    }

    public int getSeats() {
        return seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public void changeTires() {
        int month = LocalDate.now().getMonthValue();
        System.out.println(month);
        if (month == 12 || month == 1 || month == 2) {
            setWinterTires(true);
            setSummerTires(false);
        } else {
            setWinterTires(false);
            setSummerTires(true);
        }
    }

    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска. Производство: " + country + ", " + color + " цвет кузова. Объем двигателя - " + engineVolume + " л. Коробка передач: " + transmission + ". Тип кузова: " + carBody + ". Количество мест: " + seats + ". Гос. номер: " + regNumber;
    }
}
