package Composition;

public class Sprinkler {
    private String s1, s2 ;
    private Water water = new Water();
    private int var;
    private  float f;

    public Sprinkler(String s1, String s2, int var, float f) {
        this.s1 = s1;
        this.s2 = s2;
        this.var = var;
        this.f = f;
    }

    @Override
    public String toString() {
        return "Sprinkler{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", water=" + water +
                ", var=" + var +
                ", f=" + f +
                '}';
    }
}
