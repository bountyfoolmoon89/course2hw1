package transport;

import values.ValidateUtils;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected final int year;
    protected final String country;
    protected String color;
    protected double maxSpeed;

    protected double fuelPercentage;

    public Transport(String brand, String model, int year, String country, String color, double maxSpeed, double fuelPercentage) {
        setBrand(brand);
        setModel(model);
        this.year = ValidateUtils.validateYear(year);
        this.country = ValidateUtils.validateCarParameters(country);
        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuelPercentage(fuelPercentage);
    }

    public abstract void refill();

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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = ValidateUtils.validateCarParameters(brand);
    }

    public void setModel(String model) {
        this.model = ValidateUtils.validateCarParameters(model);
    }

    public void setColor(String color) {
        this.color = ValidateUtils.validateCarColor(color);
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = ValidateUtils.validateDouble(maxSpeed);
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = ValidateUtils.validateDouble(fuelPercentage);
    }
}
