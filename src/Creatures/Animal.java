package Creatures;

import values.ValidateUtils;

public abstract class Animal {
    protected String nameAnimal;
    protected int age;

    protected String areal;

    protected double speed;

    protected String typeOfFood;

    protected String typeOfMoving;

    public Animal(String nameAnimal, int age, String areal, double speed, String typeOfFood) {
        this.nameAnimal = ValidateUtils.validateString(nameAnimal);
        this.age = ValidateUtils.validateNum(age);
        this.areal = ValidateUtils.validateString(areal);
        this.speed = ValidateUtils.validateDouble(speed);
        this.typeOfFood = ValidateUtils.validateString(typeOfFood);
    }

    public Animal(String nameAnimal, int age, String areal) {
        this.nameAnimal = ValidateUtils.validateString(nameAnimal);
        this.age = ValidateUtils.validateNum(age);
        this.areal = ValidateUtils.validateString(areal);
    }

    public Animal(String nameAnimal, int age, String areal, String typeOfMoving) {
        this.nameAnimal = ValidateUtils.validateString(nameAnimal);
        this.age = ValidateUtils.validateNum(age);
        this.areal = ValidateUtils.validateString(areal);
        this.typeOfMoving = ValidateUtils.validateString(typeOfMoving);
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        this.areal = areal;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfMoving() {
        return typeOfMoving;
    }

    public void setTypeOfMoving(String typeOfMoving) {
        this.typeOfMoving = typeOfMoving;
    }
}
