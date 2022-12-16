package Creatures;

public class NotFlying extends Birds {

    public NotFlying(String nameAnimal, int age, String areal, String typeOfMoving) {
        super(nameAnimal, age, areal, typeOfMoving);
    }

    @Override
    public String toString() {
        return "Нелетающее: " +
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

    public void walk() {

    }

    public void hunt() {

    }

}
