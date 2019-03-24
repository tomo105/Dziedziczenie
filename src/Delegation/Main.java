package Delegation;

public class Main {
    public static void main(String[] args) {

        //uzycie dziedziczenia
        Ship ship = new Ship("BlackHawk");
        ship.forward(45);

        //uzycie delegacji
        ShipDelegation shipDelegation = new ShipDelegation("orkan");
        shipDelegation.left(34);
    }
}
