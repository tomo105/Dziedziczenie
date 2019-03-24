package Delegation;

public class ShipDelegation {
    private String name;
    private ShipControls shipControls = new ShipControls();
    //dzialamy na obiekcie shipControls

    ShipDelegation(String name) {
        this.name = name;
    }

    //metody wywoluja metody od delegatow
    void up(int v) {
        shipControls.up(v);
    }

    void down(int v) {
        shipControls.down(v);
    }

    void left(int v) {
        shipControls.left(v);
    }

    void right(int v) {
        shipControls.right(v);
    }

    void forward(int v) {
        shipControls.forward(v);
    }
}

