package CompositionCar;

public class Car {
    private String color;
    private int numberOfTyres;
    private Engine engine;

    public Car(String color, int numberOfTyres, String engineName,
               String engineType, String enginePower) {

        this.engine = new Engine();
        this.color = color;
        this.numberOfTyres = numberOfTyres;
        engine.setEngineName(engineName);
        engine.setEnginePower(enginePower);
        engine.setEngineType(engineType);
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
}
