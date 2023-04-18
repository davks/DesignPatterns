package builder2;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private int tall;
    private String userName;

    public Person(String name, String surname, int age, int weight, int tall, String userName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.tall = tall;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getTall() {
        return tall;
    }

    public String getUserName() {
        return userName;
    }
}
