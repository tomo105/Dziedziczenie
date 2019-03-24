package abcd;

public class Main {
    public static void main(String[] args) {
        C c = new C("ala",5);
        //pomimo ze nie ma konstruktora w C (jest tylko domyslny) to i tak wywolywany jest konstruktor
        //z klasy nadrzednej A no i z utworzonego obiektu B
        D d = new D();
        System.out.println();
        Root root = new Root();

    }
}
