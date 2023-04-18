package builder2;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder("davcer")
                .setName("David")
                .setSurname("Cerny")
                .setAge(35)
                .setWeight(85)
                .setTall(178)
                .build();

        System.out.println(person.getUserName() + " " + person.getName() + " " + person.getSurname() + " " + person.getAge() + " " + person.getTall());

        Person person2 = new PersonBuilder("kacer")
                .setName("Karolina")
                .build();

        System.out.println(person2.getUserName() + " " + person2.getName() + " " + person2.getSurname() + " " + person2.getAge() + " " + person2.getTall());
    }
}
