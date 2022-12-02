import java.util.Objects;

public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Automobile(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
        if (year <= 0) {
            this.year = 2000;
        } else if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else if (brand == null | brand.isEmpty() | brand.isBlank()) {
            this.brand = "default";
        } else if (model == null | model.isEmpty() | model.isBlank()) {
            this.model = "default";
        } else if (country == null | country.isEmpty() | country.isBlank()) {
            this.country = "default";
        } else if (color == null | color.isEmpty() | color.isBlank()) {
            this.color = "белый";
        }
    }

    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска. Производство: " + country + ", " + color + " цвет кузова. Объем двигателя - " + engineVolume + " л.";
    }
}
