package Creatures;

public class Predator extends Mammal {

    public Predator(String nameAnimal, int age, String areal, double speed, String typeOfFood) {
        super(nameAnimal, age, areal, speed, typeOfFood);
    }

    @Override
    public String toString() {
        return "Хищник: " +
                "Имя - " + nameAnimal + '\'' +
                ". Возраст - " + age +
                ". Ареал обитания - " + areal + '\'' +
                ". Макс. скорость - " + speed +
                "км/ч. Пища - " + typeOfFood + '\'' +
                '.';
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    public void walk() {

    }

    public void hunt() {

    }

}
