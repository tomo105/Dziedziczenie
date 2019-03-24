package Singleton;

 class Lunch {


    void TestPrivate() {
        //   Soup1 soup1 = new Soup1();
        //nie uda sie bo dostep prywatny!!
    }

    void TestStatic() {
        Soup1 soup1 = Soup1.makeSoup();
        System.out.println(soup1);
        System.out.println(Soup1.makeSoup());
        //tworzy przez metode statyczna
    }

    void TestSingleton() {
        Soup2 soup2 = Soup2.access();
        Soup2 s = Soup2.access();
        soup2.addOne();
        soup2.AddFive();
        s.AddFive();  //dodalo do tego samej instancji !!
        //SINGLETON !!
    }

    void TestSingleton2() {
        Soup3 soup3 = Soup3.makeSoupOnce();
        Soup3 soup33 = Soup3.makeSoupOnce();
        System.out.println(soup3);
        System.out.println(soup33);
        soup3.addFive();
        soup33.subTen();
        soup3.subTen();
        //SINGLETON
    }
}
