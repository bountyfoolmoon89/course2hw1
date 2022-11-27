public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    public String toString(){
        return brand+" "+model+", "+year+" года выпуска. Сборка в "+country+", "+color+" цвет. Объем двигателя - "+engineVolume+" л.";
    }
}
