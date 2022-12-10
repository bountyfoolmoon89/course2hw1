import transport.Automobile;

public class Main {
    public static void main(String[] args) {
        Person maxim = new Person(1998, "Максим", "Минск", "бренд-менеджер");
        Person anya = new Person(1993, "Аня", "Москва", "методист образовательных программ");
        Person kate = new Person(1992, "Катя", "Калининград", "продакт-менеджер");
        Person artem = new Person(1995, "Артём", "Москва", "директор по развитию бизнеса");
        Person vladimir = new Person(2001, "Владимир", "Казань");

        Automobile lada = new Automobile("Lada", "Granta", 2015, "Россия", "желтый", 1.7, "Ручная КПП", "Седан", 5, "а123вк178");
        Automobile audi = new Automobile("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0, "Автоматическая КПП", "Седан", 5, "в423ва348");
        Automobile bmw = new Automobile("BMW", "Z8", 2021, "Германия", "черный", 3.0, "Автоматическая КПП", "Седан", 5, "п123цу178");
        Automobile kia = new Automobile("KIA", "Sportage 4-e поколения", 2018, "Южная Корея", "красный", 2.4, "Ручная КПП", "Седан", 5, "р123сч178");
        Automobile hyundai = new Automobile("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, "Автоматическая КПП", "Седан", 5, "г123ап178");

        Flower rose = new Flower("Роза", "Нидерланды", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        maxim.sayHelloExtended();
        anya.sayHelloExtended();
        kate.sayHelloExtended();
        artem.sayHelloExtended();
        vladimir.sayHello();
        printSeparator();
        System.out.println(lada);
        System.out.println();
        System.out.println(audi);
        System.out.println();
        System.out.println(bmw);
        System.out.println();
        System.out.println(kia);
        System.out.println();
        System.out.println(hyundai);
        printSeparator();
        rose.infoFlower();
        chrysanthemum.infoFlower();
        pion.infoFlower();
        gypsophila.infoFlower();
    }
    public static void printSeparator() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}