package Singleton;

public class Main {
    public static void main(String[] args) {
        Lunch lunch = new Lunch();
        lunch.TestPrivate();

        lunch.TestSingleton();
        lunch.TestStatic();
        lunch.TestStatic();

    }
}
