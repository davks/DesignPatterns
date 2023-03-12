package factory;

public class VehicleFactory {

    public Car vehicle(String company, String color) {
        return switch (company) {
            case "Skoda" -> new SkodaFabia().createVehicle(color);
            case "Ford" -> new FordMondeo().createVehicle(color);
            default -> new MitsubishiAsx().createVehicle(color);
        };
    }

    public IVehicle vehicle(String company) {
        // Create car by company
        return switch (company) {
            case "Skoda" -> new SkodaFabia();
            case "Ford" -> new FordMondeo();
            default -> new MitsubishiAsx();
        };
    }
}
