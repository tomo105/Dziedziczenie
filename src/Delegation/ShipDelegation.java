package Delegation;

public class ShipDelegation {
    private  String name;

    public ShipDelegation(String name) {
        this.name = name;
    }
    private ShipControls shipControls = new ShipControls();

    public void up(int v) {
        shipControls.up(v);
    }

    public void down(int v) {
        shipControls.down(v);
    }

    public void left(int v) {
        shipControls.left(v);
    }

    public void right(int v) {
        shipControls.right(v);
    }

    public void forward(int v) {
        shipControls.forward(v);
    }
}

