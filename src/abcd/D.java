package abcd;

import abcd.A;

public class D extends A {
    private int var;

    public D() {
        super( "Super");
        System.out.println("D constructor");
    }

    public D(int var) {
        super("Superrr");
        System.out.println("D constructor");
        this.var = var;
    }
}
