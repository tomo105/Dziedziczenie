package Singleton;

class Soup2 {
    private int value = 0;

    private Soup2() {
    }

    private static Soup2 soup2 = new Soup2();

    //utwozenie obiektu statycznego i zwrocenie referencji   <<SINGLETON>>
    static Soup2 access() {
        return soup2;
    }

    void addOne() {
        value++;
        System.out.println("f1 added 1, now value: " + value);
    }

    void AddFive() {
        value += 5;
        System.out.println("f2 added 5, now value: " + value);
    }
}
