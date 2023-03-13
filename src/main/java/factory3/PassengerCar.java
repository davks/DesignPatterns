package factory3;

import factory.Vehicle;

public class PassengerCar extends Vehicle implements ICar {
    private int countPassenger;

    public PassengerCar(String company, String model, String color, int countDoors, boolean steeringWheelOnTheRight, int countPassenger) {
        super(company, model, color, countDoors, steeringWheelOnTheRight);
        this.countPassenger = countPassenger;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    @Override
    public String getVehicleInformation() {
        return
                this.getCompany() + " " +
                        this.getModel() + " " +
                        this.getColor() + " " +
                        "passengers: " + this.getCountPassenger();
    }
}
