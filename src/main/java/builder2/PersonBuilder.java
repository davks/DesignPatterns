package builder2;

public class PersonBuilder {

    private String name = "";
    private String surname = "";
    private int age = -1;
    private int weight = -1;
    private int tall = -1;
    private String userName = "";

    PersonBuilder(String userName) {
        this.userName = userName;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public PersonBuilder setTall(int tall) {
        this.tall = tall;
        return this;
    }

    public PersonBuilder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Person build() {
        return new Person(name, surname, age, weight, tall, userName);
    }
}
