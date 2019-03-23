package Singleton;

 public class Lunch {


    void TestPrivate() {
        //   Soup1 soup1 = new Soup1();
        //nie uda sie bo dostep prywatny!!
    }

    void TestStatic() {
        Soup1 soup1 = Soup1.makeSoup();
            //tworzy przez metode statyczna
    }

    void TestSingleton() {
        Soup2.access().function2();
        Soup2.access().function();
        //SINGLETON !!
    }
}
