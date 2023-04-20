package prototype;

import java.util.HashMap;
import java.util.Map;

// Prototype manager
public class CarCache {
    private static final Map<String, Car> carMap = new HashMap<>();

    // My three objects
    public static void loadCache() {
        carMap.put("1", new Car("Skoda", 4, new SteeringWheel("Black", 35)));
        carMap.put("2", new Car("BMW", 4, new SteeringWheel("Red", 30)));
        carMap.put("3", new Car("Mazda", 4, new SteeringWheel("Green", 32)));
    }

    // We can add new prototype to map
    public static void newCar(String key, Car car) {
        carMap.put(key, car);
    }

    // Get clone by key
    public static Car getCar(String key) throws CloneNotSupportedException {
        return (Car) carMap.get(key).deepClone();
    }
}
