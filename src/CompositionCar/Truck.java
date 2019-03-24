package CompositionCar;

public class Truck {
    private String color;
    private int numberOfTyres;
    private double length;
    private double MaxCapacity;
    private Engine engine;

    public Truck(String color, int numberOfTyres, double length,
                 double maxCapacity, String type, String name, String power) {
        this.color = color;
        this.numberOfTyres = numberOfTyres;
        this.length = length;
        MaxCapacity = maxCapacity;

        this.engine = new Engine();
        engine.setEngineType(type);
        engine.setEngineName(name);
        engine.setEnginePower(power);
    }

    public String getEngineType() {
        return engine.getEngineType();
    }

    public String getEngineName() {

        return engine.getEngineName();
    }

    public String getEnginePower() {

        return engine.getEnginePower();
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public double getLength() {
        return length;
    }

    public double getMaxCapacity() {
        return MaxCapacity;
    }
}
