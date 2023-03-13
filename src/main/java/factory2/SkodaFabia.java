package factory2;

import factory.Vehicle;

public class SkodaFabia implements IVehicle {

    @Override
    public Vehicle createVehicle(String color) {
        return new Vehicle("Škoda", "Fabia", color, 5, false);
    }
}
