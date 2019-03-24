package Singleton;

class Soup3 {
    private static Soup3 soup = null;
    private static int var = 100;

    private Soup3() {
    }

    static Soup3 makeSoupOnce() {
        if (soup == null) {

            System.out.println("tworze nowy");
            soup = new Soup3();

        }
        return soup;
    }

   void addFive() {
        var += 5;
        System.out.println("var: " + var);
    }

    void subTen() {
        var -= 10;
        System.out.println("var: " + var);
    }
            //SINLGETON!!
}
