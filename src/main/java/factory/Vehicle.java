package factory;

public class Vehicle {
    private String company;
    private String model;
    private String color;
    private int countDoors;
    private boolean steeringWheelOnTheRight;

    public Vehicle(String company, String model, String color, int countDoors, boolean steeringWheelOnTheRight) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.countDoors = countDoors;
        this.steeringWheelOnTheRight = steeringWheelOnTheRight;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    public boolean isSteeringWheelOnTheRight() {
        return steeringWheelOnTheRight;
    }

    public void setSteeringWheelOnTheRight(boolean steeringWheelOnTheRight) {
        this.steeringWheelOnTheRight = steeringWheelOnTheRight;
    }

    // Factory method - create Ford Mondeo
    public static Vehicle createFordMondeo(String color) {
        return new Vehicle("Ford", "Mondeo", color, 4, false);
    }

    // Factory method - create Skoda Fabia
    public static Vehicle createSkodaFabia(String color) {
        return new Vehicle("Škoda", "Fabia", color, 5, true);
    }

    // Factory method - create Mitsubishi ASX
    public static Vehicle createMitsubishiAsx(String color) {
        return new Vehicle("Mitsubishi", "ASX", color, 5, false);
    }

    public static Vehicle createCar(String company, String color) {
        return switch (company) {
            case "Skoda" -> new Vehicle("Škoda", "Fabia", color, 5, false);
            case "Ford" -> new Vehicle("Ford", "Mondeo", color, 4, false);
            case "Mitsubishi" -> new Vehicle("Mitsubishi", "ASX", color, 5, true);
            default -> throw new IllegalArgumentException("Unknown company: " + company);
        };
    }
}
