package Exp2;

public class Circle extends Shape {
    public Circle(int i) {
        super(i);
        System.out.println("rysowanie figury cirlce");
    }

    @Override
    void dispose() {
        System.out.println("wymazywanie circle");
        super.dispose();
    }
}
