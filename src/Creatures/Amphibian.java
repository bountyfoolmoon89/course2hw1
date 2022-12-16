package Creatures;

public class Amphibian extends Animal {

    public Amphibian(String nameAnimal, int age, String areal) {
        super(nameAnimal, age, areal);
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

    public void hunt() {

    }

    @Override
    public String toString() {
        return "Пресноводное: " +
                "Имя - " + nameAnimal + '\'' +
                ". Возраст - " + age +
                ". Среда обитания - " + areal + '\'' +
                '.';
    }
}
