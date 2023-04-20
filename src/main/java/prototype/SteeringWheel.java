package prototype;

public class SteeringWheel implements Cloneable{
    private String color;
    private int size;

    public SteeringWheel(String color, int size) {
        this.color = color;
        this.size = size;
    }

    // Shallow clone - we don't have objects as a atribute
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
