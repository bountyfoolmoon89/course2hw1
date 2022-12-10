import values.ValidateUtils;

public class Flower {
    String flowerName;
    String country;
    double cost;
    int lifeSpan;

    Flower(String flowerName, String country, double cost) {
        this(flowerName, country, cost, 3);
    }

    Flower(String flowerName, String country, int lifeSpan) {
        this(flowerName, country, 1, lifeSpan);
    }

    Flower(String flowerName, double cost, int lifeSpan) {
        this(flowerName, "Россия", cost, lifeSpan);
    }

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        this.flowerName = ValidateUtils.validateString(flowerName);
        this.country = ValidateUtils.validateString(country);
        this.cost = ValidateUtils.validateDouble(cost);
        this.lifeSpan = ValidateUtils.validateNum(lifeSpan);

    }

    void infoFlower() {
        System.out.println("Название цветов: " + flowerName + ". Страна происхождения: " + country + ". Цена за одну штуку: " + cost + " рублей. Срок жизни: " + lifeSpan + " дней.");
    }
}
