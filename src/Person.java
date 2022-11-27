import java.util.Objects;

public class Person {
    int dateOfBirth;
    String name;
    String city;
    String jobTitle;


    Person(int dateOfBirth, String name, String city, String jobTitle) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.city = city;
        this.jobTitle = jobTitle;
        if (dateOfBirth <= 0) {
            System.err.println("Возраст не может быть отрицательным или равным нулю");
        } else if (name == null | Objects.equals(name, "")) {
            System.out.println("Привет! Меня зовут " + "пожалуйста, укажите имя" + ". Я из города " + city + ". Я родился в " + dateOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        } else if (city == null | Objects.equals(city, "")) {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + "пожалуйста, укажите город" + ". Я родился в " + dateOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        } else if (jobTitle == null | Objects.equals(jobTitle, "")) {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + dateOfBirth + " году. Я работаю на должности " + "пожалуйста, укажите должность" + ". Будем знакомы!");
        }
    }

        void sayHello(){
            System.out.println("Привет! Меня зовут "+name+". Я из города "+city+". Я родился в "+dateOfBirth+" году. Я работаю на должности "+jobTitle+". Будем знакомы!");

    }
}
