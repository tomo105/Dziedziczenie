package Exp2;

public class CADSystem extends Shape {

    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        circle = new Circle(1);
        triangle = new Triangle(1);
        System.out.println("Konstruktor xd");

    }

    @Override
    void dispose() {
        triangle.dispose();
        circle.dispose();
        System.out.println("cad dispose ()");
        for(int i = lines.length - 1; i>= 0 ; i--  )
            lines[i].dispose();
        super.dispose();
    }
}
