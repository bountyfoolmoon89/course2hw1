package transport;

public class Train extends Transport {
    private double priceTrip;
    private double timeTrip;
    private String firstStop;
    private String lastStop;
    private int amountVan;


    public Train(String brand, String model, int year, String country, String color, double maxSpeed, double priceTrip, double timeTrip, String firstStop, String lastStop, int amountVan, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        this.priceTrip = priceTrip;
        this.timeTrip = timeTrip;
        this.firstStop = firstStop;
        this.lastStop = lastStop;
        this.amountVan = amountVan;
    }

    @Override
    public void refill() {
        if (fuelPercentage < 50.0) {
            System.out.println(brand + ": Требуется заправка дизелем!");
        }
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(double priceTrip) {
        this.priceTrip = priceTrip;
    }

    public double getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(double timeTrip) {
        this.timeTrip = timeTrip;
    }

    public String getFirstStop() {
        return firstStop;
    }

    public void setFirstStop(String firstStop) {
        this.firstStop = firstStop;
    }

    public String getLastStop() {
        return lastStop;
    }

    public void setLastStop(String lastStop) {
        this.lastStop = lastStop;
    }

    public int getAmountVan() {
        return amountVan;
    }

    public void setAmountVan(int amountVan) {
        this.amountVan = amountVan;
    }

    @Override
    public String toString() {
        return "Поезд: " +
                "Марка - " + brand + '\'' +
                ". Модель - " + model + '\'' +
                ". Год выпуска - " + year +
                ". Страна производства - " + country + '\'' +
                ". Станция отправления - " + firstStop + '\'' +
                ". Станция прибытия - " + lastStop + '\'' +
                ". Макс. скроость - " + maxSpeed +
                ". Стоимость проезда - " + priceTrip +
                ". Кол-во вагонов - " + amountVan +
                '.';
    }
}
