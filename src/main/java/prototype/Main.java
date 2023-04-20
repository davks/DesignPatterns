package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("Skoda", 4, new SteeringWheel("Black", 30));
        Car car2 = (Car) car1.deepClone();

        car1.setBrand("BMW");
        car1.getSteeringWheel().setSize(28);
        car1.getSteeringWheel().setColor("Red");
        car2.setCountOfDoors(5);

        System.out.println(car1.getBrand() + " " + car1.getCountOfDoors() + " " + car1.getSteeringWheel().getColor() + " " + car1.getSteeringWheel().getSize());
        System.out.println(car2.getBrand() + " " + car2.getCountOfDoors() + " " + car2.getSteeringWheel().getColor() + " " + car2.getSteeringWheel().getSize());
    }
}
