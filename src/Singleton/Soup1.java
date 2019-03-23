package Singleton;

public class Soup1 {
    private Soup1() {

    }
    //udostepnienie konstrukcji przy pomocy metody statycznje
    public static Soup1 makeSoup() {
        System.out.println("create object by static function");
        return new Soup1();
    }
}
