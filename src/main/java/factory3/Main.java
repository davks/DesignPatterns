package factory3;

public class Main {
    public static void main(String[] args) {
        // Create Factory method
        CarFactory carFactory = new CarFactory();

        // Create objects from factory class
        ICar fordMondeo = carFactory.createCar("Ford", "Blue");
        ICar tatra813 = carFactory.createCar("Tatra", "Red");
        ICar skodaFabia = carFactory.createCar("Skoda", "Green");

        // Out
        System.out.println(fordMondeo.getVehicleInformation());
        System.out.println(tatra813.getVehicleInformation());
        System.out.println(skodaFabia.getVehicleInformation());
    }
}
