package Singleton;

public class Soup2 {
    private Soup2() {
    }

    private static Soup2 soup2 = new Soup2();
    //utwozenie obiektu statycznego i zwrocenie referencji
    public static Soup2 access() {
        return soup2;
    }

    public void function() {

    }
    public void function2() {

    }
}
