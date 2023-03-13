package factory3;

import factory.Vehicle;

public class Truck extends Vehicle implements ICar {
    private int cargoWeight;

    public Truck(String company, String model, String color, int countDoors, boolean steeringWheelOnTheRight, int cargoWeight) {
        super(company, model, color, countDoors, steeringWheelOnTheRight);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public String getVehicleInformation() {
        return
                this.getCompany() + " " +
                        this.getModel() + " " +
                        this.getColor() + " " +
                        "cargo weight: " + this.getCargoWeight();
    }
}
