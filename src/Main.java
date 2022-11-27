public class Main {
    public static void main(String[] args) {
        Person maxim = new Person(1988, "Максим", "Минск", "бренд-менеджер");
        Person anya = new Person(1993, "Аня", "Москва", "методист образовательных программ");
        Person kate = new Person(1992, "Катя", "Калининград", "продакт-менеджер");
        Person artem = new Person(1995, "Артём", "Москва", "директор по развитию бизнеса");

        Automobile lada = new Automobile("Lada", "Granta", 2015, "Россия", "желтый", 1.7);
        Automobile audi = new Automobile("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
        Automobile bmw = new Automobile("BMW", "Z8", 2021, "Германия", "черный", 3.0);
        Automobile kia = new Automobile("KIA", "Sportage 4-e поколения", 2018, "Южная Корея", "красный", 2.4);
        Automobile hyundai = new Automobile("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);

        maxim.sayHello();
        anya.sayHello();
        kate.sayHello();
        artem.sayHello();
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
    }

    public static void printSeparator() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}