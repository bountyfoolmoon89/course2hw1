import values.ValidateUtils;

public class Person {
    private int yearOfBirth;
    private String name;
    private String city;
    private String jobTitle;

    Person(int yearOfBirth, String name, String city) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.city = city;
    }

    Person(int yearOfBirth, String name, String city, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.city = city;
        this.jobTitle = jobTitle;
    }


    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = ValidateUtils.validateString(name);
    }


    public void setJobTitle(String jobTitle) {
        this.jobTitle = ValidateUtils.validateString(jobTitle);
    }


    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = ValidateUtils.validateNum(yearOfBirth);
    }


    public void setCity(String city) {
        this.city = ValidateUtils.validateString(city);
    }

    void sayHello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth + " году. Будем знакомы!");
    }

    void sayHelloExtended() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
