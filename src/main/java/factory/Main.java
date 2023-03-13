package factory;

public class Main {
    public static void main(String[] args) {
        // Create objects from factory methods
        Vehicle mitsubishi1 = Vehicle.createMitsubishiAsx("White");
        Vehicle ford1 = Vehicle.createFordMondeo("Blue");
        Vehicle skoda1 = Vehicle.createSkodaFabia("Red");
        Vehicle ford2 = Vehicle.createCar("Ford", "Yellow");

        // Out
        System.out.println(
                mitsubishi1.getCompany() + " " +
                        mitsubishi1.getModel() + " " +
                        mitsubishi1.getColor()
        );

        System.out.println(
                ford1.getCompany() + " " +
                        ford1.getModel() + " " +
                        ford1.getColor()
        );

        System.out.println(
                ford2.getCompany() + " " +
                        ford2.getModel() + " " +
                        ford2.getColor()
        );

        System.out.println(
                skoda1.getCompany() + " " +
                        skoda1.getModel() + " " +
                        skoda1.getColor()
        );
    }
}
