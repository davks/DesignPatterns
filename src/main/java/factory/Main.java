package factory;

public class Main {
    public static void main(String[] args) {
        useFactoryMethod();
        useAbstractFactoryMethod();
    }

    static void useFactoryMethod() {
        // Create objects from factory methods
        Car mitsubishi1 = Car.createMitsubishiAsx("White");
        Car ford1 = Car.createFordMondeo("Blue");
        Car skoda1 = Car.createSkodaFabia("Red");
        Car ford2 = Car.createCar("Ford", "Yellow");

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

    static void useAbstractFactoryMethod() {
        // Create Factory method
        VehicleFactory myFactory = new VehicleFactory();

        // Create objects from factory class
        Car mitsubishiAsxRed = myFactory.vehicle("Mitsubishi", "Red");
        Car fordMondeoBlack = myFactory.vehicle("Ford", "Black");

        Car fordMondeoBlue = myFactory.vehicle("Ford").createVehicle("Blue");
        Car mitsubishiAsxWhite = myFactory.vehicle("Mitsubishi").createVehicle("White");

        IVehicle skoda = myFactory.vehicle("Skoda");
        Car skodaFabiaGreen = skoda.createVehicle("Green");

        // Out
        System.out.println(
                skodaFabiaGreen.getCompany() + " " +
                        skodaFabiaGreen.getModel() + " " +
                        skodaFabiaGreen.getColor()
        );

        System.out.println(
                fordMondeoBlue.getCompany() + " " +
                        fordMondeoBlue.getModel() + " " +
                        fordMondeoBlue.getColor()
        );

        System.out.println(
                mitsubishiAsxWhite.getCompany() + " " +
                        mitsubishiAsxWhite.getModel() + " " +
                        mitsubishiAsxWhite.getColor()
        );

        System.out.println(
                mitsubishiAsxRed.getCompany() + " " +
                        mitsubishiAsxRed.getModel() + " " +
                        mitsubishiAsxRed.getColor()
        );

        System.out.println(
                fordMondeoBlack.getCompany() + " " +
                        fordMondeoBlack.getModel() + " " +
                        fordMondeoBlack.getColor()
        );
    }
}
