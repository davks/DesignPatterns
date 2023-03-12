package factory;

public class SkodaFabia implements IVehicle {

    @Override
    public Car createVehicle(String color) {
        return new Car("Škoda", "Fabia", color, 5, false);
    }
}
