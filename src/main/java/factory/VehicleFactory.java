package factory;

public class VehicleFactory {

    public Car vehicle(String company, String color) {
        return switch (company) {
            case "Skoda" -> new SkodaFabia().createVehicle(color);
            case "Ford" -> new FordMondeo().createVehicle(color);
            case "Mitsubishi" -> new MitsubishiAsx().createVehicle(color);
            default -> throw new IllegalArgumentException("Unknown company");
        };
    }

    public IVehicle vehicle(String company) {
        // Create car by company
        return switch (company) {
            case "Skoda" -> new SkodaFabia();
            case "Ford" -> new FordMondeo();
            case "Mitsubishi" -> new MitsubishiAsx();
            default -> throw new IllegalArgumentException("Unknown company");
        };
    }
}
