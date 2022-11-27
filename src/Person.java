public class Person {
    int dateOfBirth;
    String name;
    String city;
    String jobTitle;


    Person(int dateOfBirth, String name, String city, String jobTitle){
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.city = city;
        this.jobTitle = jobTitle;
    }
    void sayHello(){
        System.out.println("Привет! Меня зовут "+name+". Я из города "+city+". Я родился в "+dateOfBirth+" году. Я работаю на должности "+jobTitle+". Будем знакомы!");
    }
}
