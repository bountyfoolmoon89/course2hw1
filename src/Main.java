import Creatures.*;
import transport.Auto;
import transport.Bus;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Person maxim = new Person(1998, "Максим", "Минск", "бренд-менеджер");
        Person anya = new Person(1993, "Аня", "Москва", "методист образовательных программ");
        Person kate = new Person(1992, "Катя", "Калининград", "продакт-менеджер");
        Person artem = new Person(1995, "Артём", "Москва", "директор по развитию бизнеса");
        Person vladimir = new Person(2001, "Владимир", "Казань");

        Auto lada = new Auto("Lada", "Granta", 2015, "Россия", "желтый", 1.7, 130,"Ручная КПП", "Седан", 5, "а123вк178", 35);
        Auto audi = new Auto("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0, 210,"Автоматическая КПП", "Седан", 5, "в423ва348", 59);
        Auto bmw = new Auto("BMW", "Z8", 2021, "Германия", "черный", 3.0, 230,"Автоматическая КПП", "Седан", 5, "п123цу178", 98);
        Auto kia = new Auto("KIA", "Sportage 4-e поколения", 2018, "Южная Корея", "красный", 2.4, 190,"Ручная КПП", "Седан", 5, "р123сч178", 29);
        Auto hyundai = new Auto("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, 120,"Автоматическая КПП", "Седан", 5, "г123ап178", 45);

        Flower rose = new Flower("Роза", "Нидерланды", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия", "Белый", 301, 3500, 3, "Белорусский вокзал", "Минск-Пасс", 11, 63);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "Черный", 270, 1700, 2, "Ленинградский вокзал", "Ленинград-Пасс", 8, 49);

        Bus firstBus = new Bus("Mercedes-Benz", "Sprinter III", 2021, "Германия", "Черный", 160, 100);
        Bus secondBus = new Bus("Yutong", "ZK6128H", 2020, "Китай", "Красный", 190, 89);
        Bus thirdBus = new Bus("МАЗ", "303", 2019, "Беларусь", "Белый", 170, 37);

        Amphibian frog = new Amphibian("Жаба Жора", 4, "Болото");
        Amphibian natrix = new Amphibian("Уж Жужа", 6, "Водоём");

        Herbivore gazelle = new Herbivore("Газель Гиза", 12, "Саванна", 80, "Трава");
        Herbivore giraffe = new Herbivore("Жираф Жорж", 10, "Саванна", 55, "Листья");
        Herbivore horse = new Herbivore("Лошадь Шерр", 15, "Степь", 60, "Зерно");

        Predator hyena = new Predator("Гиена Прима", 13, "Пустыня", 60, "Падаль");
        Predator tiger = new Predator("Тигр Гриша", 14, "Пустыня", 65, "Звери");
        Predator bear = new Predator("Медведь Михаил", 16, "Тундра", 50, "Растительность");

        NotFlying peacock = new NotFlying("Павлин Паша", 11, "Джунгли", "Бег");
        NotFlying penguin = new NotFlying("Пингвин Пава", 9, "Антарктика", "Бег");
        NotFlying dodo = new NotFlying("Додо Дуда", 8, "Остров Маврикий", "Бег");

        Flying seagull = new Flying("Чайка Чача", 7, "Побережье", "Полет");
        Flying albatross = new Flying("Альбатрос Борис", 5, "Тихий Океан", "Полет");
        Flying falcon = new Flying("Сокол Филя", 14, "Весь мир", "Полет");

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
        printSeparator();
        System.out.println(lastochka);
        System.out.println(leningrad);
        printSeparator();
        System.out.println(firstBus);
        System.out.println(secondBus);
        System.out.println(thirdBus);
        printSeparator();
        audi.refill();
        leningrad.refill();
        thirdBus.refill();
        printSeparator();
        System.out.println(frog);
        System.out.println(natrix);
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

    }
    public static void printSeparator() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}