package Singleton;

public class Soup1 {
    private Soup1() {

    }
    //udostepnienie konstrukcji przy pomocy metody statycznje
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}
