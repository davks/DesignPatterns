package factory;

public class FordMondeo implements IVehicle {
    @Override
    public Car createVehicle(String color) {
        return new Car("Ford", "Mondeo", color, 4, true);
    }
}
