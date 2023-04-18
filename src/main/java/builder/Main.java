package builder;

public class Main {
    public static void main(String[] args) {
        Person person = Person
                .userName("davcer")
                .withName("David")
                .withSurname("Cerveny")
                .setAge(24)
                .setTall(185)
                .setWeight(87)
                .build();

        System.out.println(person.getUserName() + " " + person.getName() + " " + person.getSurname());

        Person person2 = Person.userName("radbi")
                .withName("Radek")
                .build();
        person2.setSurname("Bily");

        System.out.println(person2.getUserName() + " " + person2.getName() + " " + person2.getSurname());
    }
}
