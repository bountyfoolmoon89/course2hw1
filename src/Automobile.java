import java.util.Objects;

public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Automobile(String brand, String model, int year, String country, String color, double engineVolume){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
        if (year <= 0){
            this.year = 2000;
        } else if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else if (brand == null | Objects.equals(brand, "")) {
            this.brand = "default";
        } else if (model == null | Objects.equals(model, "")) {
            this.model = "default";
        } else if (country == null | Objects.equals(country, "")) {
            this.country = "default";
        } else if (color == null | Objects.equals(color, "")) {
            this.color = "белый";
        }
    }
    public String toString(){
        return brand+" "+model+", "+year+" года выпуска. Производство: "+country+", "+color+" цвет кузова. Объем двигателя - "+engineVolume+" л.";
    }
}
