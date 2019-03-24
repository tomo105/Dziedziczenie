package EasyInheritance;

public class D extends A {
    private int var;

    public D() {
        super( "Super");
        System.out.println("constructor D");
    }

    public D(int var) {
        super("Superrr");
        System.out.println("constructor D");
        this.var = var;
    }
}
