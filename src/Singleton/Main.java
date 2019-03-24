package Singleton;

public class Main {
    public static void main(String[] args) {
        Lunch lunch = new Lunch();
        lunch.TestStatic();
        lunch.TestPrivate();

        lunch.TestSingleton();
        lunch.TestSingleton2();

    }
}
