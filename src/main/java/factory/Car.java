package factory;

public class Car {
    private String company;
    private String model;
    private String color;
    private int countDoors;
    private boolean steeringWheelOnTheRight;

    public Car(String company, String model, String color, int countDoors, boolean steeringWheelOnTheRight) {
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
    public static Car createFordMondeo(String color) {
        return new Car("Ford", "Mondeo", color, 4, false);
    }

    // Factory method - create Skoda Fabia
    public static Car createSkodaFabia(String color) {
        return new Car("Škoda", "Fabia", color, 5, true);
    }

    // Factory method - create Mitsubishi ASX
    public static Car createMitsubishiAsx(String color) {
        return new Car("Mitsubishi", "ASX", color, 5, false);
    }

    public static Car createCar(String company, String color) {
        return switch (company) {
            case "Skoda" -> new Car("Škoda", "Fabia", color, 5, false);
            case "Ford" -> new Car("Ford", "Mondeo", color, 4, false);
            case "Mitsubishi" -> new Car("Mitsubishi", "ASX", color, 5, true);
            default -> throw new IllegalArgumentException("Unknown company");
        };
    }
}
