public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1988, "Максим", "Минск", "бренд-менеджер");
        Person person2 = new Person(1993, "Аня", "Москва", "методист образовательных программ");
        Person person3 = new Person(1992, "Катя", "Калининград", "продакт-менеджер");
        Person person4 = new Person(1995, "Артём", "Москва", "директор по развитию бизнеса");

        person1.sayHello();
        person2.sayHello();
        person3.sayHello();
        person4.sayHello();
    }
}