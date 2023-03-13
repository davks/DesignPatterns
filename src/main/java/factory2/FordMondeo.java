package factory2;

import factory.Vehicle;

public class FordMondeo implements IVehicle {
    @Override
    public Vehicle createVehicle(String color) {
        return new Vehicle("Ford", "Mondeo", color, 4, true);
    }
}
