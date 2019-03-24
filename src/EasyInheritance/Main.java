package EasyInheritance;

public class Main {
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
        // czyli konstruktor klasy bazowej jesr domyslnie wywolywany dla klasy pochodnej

        C c = new C();
        //pomimo ze nie ma konstruktora w C (jest tylko domyslny) to i tak wywolywany jest konstruktor
        //z klasy nadrzednej A no i z utworzonego obiektu B
    }
}
