package Exp2;

public class Line extends Shape {
    private int start, end;

    public Line( int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("rysowanie lini");
    }

    @Override
    void dispose() {
        System.out.println("wymazywanie linii");
        super.dispose();
    }
}
