package transport;

import transport.Car;

import java.awt.geom.Dimension2D;

public class Main {
    private static Enum<Type> printType;

    public static void main(String[] args) {
        Transport<?>transport; printType = Type.BUS;
            System.out.println(printType);

        Bus.Сapacity сapacity = Bus.Сapacity.N6;
        System.out.println(сapacity);

        Truck.LoadСapacity loadСapacity = Truck.LoadСapacity.N3;
        System.out.println(loadСapacity);

        Car.BodyType bodyType = Car.BodyType.TYPE1;
        System.out.println(bodyType);

        DriveB driveB = new DriveB("Иван Падерин", true, 12);
        Car car1 = new Car("Lada",
                "Granta",
                1.6,
                driveB,
                Type.CAR);
        printInfo(car1);

        DriverD driverD = new DriverD("Олег Газманов", true, 22);
        Bus bus1 = new Bus("ЛИАЗ",
                "677",
                5.0,
                driverD, Type.BUS);
        printInfo(bus1);

        DriverC driverC = new DriverC("Тимур Кизяков", true, 18);
        Truck truck1 = new Truck("КАМАЗ",
                "65225",
                6.0,
                driverC, Type.TRUCK);
        printInfo(truck1);

        DriverC driverC2 = new DriverC("Иван Зилов", true, 18);
        Truck truck2 = new Truck("КАМАЗ",
                "65225",
                6.0,
                driverC2, Type.TRUCK);
        printInfo(truck2);
    }
    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDrive().getName() + " управляет автомобилем " +transport.getBrand() + " и будет участвовать в заезде");
    }
}