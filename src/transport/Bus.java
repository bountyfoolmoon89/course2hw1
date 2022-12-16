package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, double maxSpeed, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
    }

    @Override
    public void refill() {
        if (fuelPercentage < 50.0) {
            System.out.println(brand + ": Требуется заправка бензином или дизелем!");
        }
    }

    @Override
    public String toString() {
        return "Автобус: " +
                "Марка - " + brand + '\'' +
                ". Модель - " + model + '\'' +
                ". Год выпуска - " + year +
                ". Страна пр-ва - " + country + '\'' +
                ". Цвет - " + color + '\'' +
                ". Макс. скорость - " + maxSpeed +
                '.';
    }
}
