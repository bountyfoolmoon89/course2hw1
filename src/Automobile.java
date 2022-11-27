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
    }
    public String toString(){
        return brand+" "+model+", "+year+" года выпуска. Производство: "+country+", "+color+" цвет кузова. Объем двигателя - "+engineVolume+" л.";
    }
}
