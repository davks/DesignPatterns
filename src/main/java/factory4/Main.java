package factory4;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(new DatabaseFactory());
        Client client2 = new Client(new NetworkFactory());

        client1.communicate();
        client2.communicate();
    }
}
