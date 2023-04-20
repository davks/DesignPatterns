package prototype2;

public class Bicycle extends Vehicle {
    private boolean cityBike;

    public Bicycle(int wheels, long price, boolean cityBike) {
        this.wheels = wheels;
        this.price = price;
        this.cityBike = cityBike;
    }

    public Bicycle(Bicycle target) {
        super(target);
        if (target != null) {
            this.cityBike = target.cityBike;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bicycle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Bicycle) {
            Bicycle t = (Bicycle) target;
            if (this.cityBike == t.cityBike && this.price == t.price && this.wheels == t.wheels) {
                System.out.println(this + " and " + t + " are clones!");
                return true;
            }
        }
        System.out.println(this + " and " + target + " are NOT clones!");
        return false;
    }
}
