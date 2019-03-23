package Exp2;

public class Triangle extends Shape {
    public Triangle(int i) {
        super(i);
    }

    @Override
    void dispose() {
        System.out.println("niszczenie triangle");
        super.dispose();
    }
}
