package prototype;

public class Car implements Cloneable {
    private String brand;
    private int countOfDoors;
    private SteeringWheel steeringWheel;

    public Car(String brand, int countOfDoors, SteeringWheel steeringWheel) {
        this.brand = brand;
        this.countOfDoors = countOfDoors;
        this.steeringWheel = steeringWheel;
    }

    // Shallow clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Shallow clone
    Object shallowClone() throws CloneNotSupportedException{
        return this.clone();
    }

    // Deep clone - all of objects
    Object deepClone() throws CloneNotSupportedException {
        Car clone = (Car) this.clone();
        clone.steeringWheel = this.steeringWheel == null ? null : (SteeringWheel) this.steeringWheel.clone();
        return clone;

        //return new Car(brand, countOfDoors, (SteeringWheel) steeringWheel.clone());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
}
