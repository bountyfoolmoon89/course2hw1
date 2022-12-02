import java.time.LocalDate;

public class Person {
    final int yearOfBirth;
    final String name;
    String city;
    String jobTitle;


    Person(int yearOfBirth, String name, String city, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.city = city;
        this.jobTitle = jobTitle;
        if (yearOfBirth <= 0) {
            System.err.println("Возраст не может быть отрицательным или равным нулю");
        } else if (name == null | name.isEmpty() | name.isBlank()) {
            System.out.println("Привет! Меня зовут " + "пожалуйста, укажите имя" + ". Я из города " + city + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        } else if (city == null | city.isEmpty() | city.isBlank()) {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + "пожалуйста, укажите город" + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        } else if (jobTitle == null | jobTitle.isEmpty() | jobTitle.isBlank()) {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + "пожалуйста, укажите должность" + ". Будем знакомы!");
        }
    }

    void sayHello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");

    }
}
