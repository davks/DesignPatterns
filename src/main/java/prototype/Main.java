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

        // CarCache
        CarCache.loadCache();
        Car car3 = CarCache.getCar("1");
        Car car4 = CarCache.getCar("2");
        Car car5 = CarCache.getCar("3");

        System.out.println(car3.getBrand() + " " + car3.getCountOfDoors() + " " + car3.getSteeringWheel().getColor() + " " + car3.getSteeringWheel().getSize());
        System.out.println(car4.getBrand() + " " + car4.getCountOfDoors() + " " + car4.getSteeringWheel().getColor() + " " + car4.getSteeringWheel().getSize());
        System.out.println(car5.getBrand() + " " + car5.getCountOfDoors() + " " + car5.getSteeringWheel().getColor() + " " + car5.getSteeringWheel().getSize());
    }
}
