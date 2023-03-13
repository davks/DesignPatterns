package factory2;

import factory.Vehicle;

public class MitsubishiAsx implements IVehicle {

    @Override
    public Vehicle createVehicle(String color) {
        return new Vehicle("Mitsubishi", "Asx", color, 5, false);
    }
}
