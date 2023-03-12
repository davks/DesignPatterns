package factory;

public class MitsubishiAsx implements IVehicle {

    @Override
    public Car createVehicle(String color) {
        return new Car("Mitsubishi", "Asx", color, 5, false);
    }
}
