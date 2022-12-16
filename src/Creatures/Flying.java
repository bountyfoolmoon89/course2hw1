package Creatures;

public class Flying extends Birds {
    public Flying(String nameAnimal, int age, String areal, String typeOfMoving) {
        super(nameAnimal, age, areal, typeOfMoving);
    }

    @Override
    public String toString() {
        return "Летающее: " +
                "Имя - " + nameAnimal + '\'' +
                ". Возраст - " + age +
                ". Ареал обитания - " + areal + '\'' +
                ". Передвижение - " + typeOfMoving + '\'' +
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


    public void hunt() {

    }

    public void fly() {

    }
}
