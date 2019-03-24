package CompositionCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("blue", 4, "V8", "2.0", "140KM");
        System.out.println(car.getEnginePower());
        Truck truck = new Truck("red", 8, 14.34, 30, "v12", "volvo", "240KM");
        System.out.println(truck.getEngineName());
    }
}
//moge dokladac klas i wykorzystwac obiekt Engine uzyzwajac go
//w kolejnych klasach nie uzywam w ten sposob dziedziczenia