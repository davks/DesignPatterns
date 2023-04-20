package prototype2;

public class Main {
    public static void main(String[] args) {
        Vehicle c1 = new Car(4, 20000, "Blue");
        Vehicle c2 = c1.clone();

        c2.isClone(c1);
        c1.isClone(c2);

        Vehicle b1 = new Bicycle(2, 1000, false);
        Vehicle b2 = b1.clone();

        b1.isClone(b2);
        b2.isClone(b1);
        c1.isClone(b1);
    }
}
