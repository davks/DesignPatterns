package builder;

// Product we want to use
public class Person {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private int tall;
    private String userName;

    private Person() {

    }

    // This is our builder that will create out product (Person) and sets up
    public static class PersonBuilder {
        // Create a new object
        private final Person person = new Person();

        private PersonBuilder(String userName) {
            person.userName = userName;
        }

        public PersonBuilder withName(String name) {
            person.name = name;
            return this;
        }

        public PersonBuilder withSurname(String surname) {
            person.surname = surname;
            return this;
        }

        public PersonBuilder setAge(int age) {
            person.age = age;
            return this;
        }

        public PersonBuilder setWeight(int weight) {
            person.weight = weight;
            return this;
        }

        public PersonBuilder setTall(int tall) {
            person.tall = tall;
            return this;
        }

        public Person build() {
            return person;
        }

    }

    // Method that creates and returns our builder
    public static PersonBuilder userName(String userName) {
        return new PersonBuilder(userName);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
