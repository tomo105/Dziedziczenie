package Delegation;

public class Ship extends ShipControls {
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                '}';
    }
}
