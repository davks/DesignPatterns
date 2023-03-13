package factory3;

public class CarFactory {

    public ICar createCar(String company, String color) {
        return switch (company) {
            case "Skoda" -> new PassengerCar("Škoda", "Fabia", color, 5, false, 4);
            case "Tatra" -> new Truck("Tatra", "813", color, 2, false, 10);
            case "Ford" -> new PassengerCar("Ford", "Mondeo", color, 4, true, 5);
            default -> throw new IllegalArgumentException("Unknown company: " + company);
        };
    }
}
