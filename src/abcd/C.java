package abcd;

import abcd.A;
import abcd.B;

public class C extends A {
    B b;
    public C(String a,int value) {
        super(a);
        this.b = new B(value);

    }
}
