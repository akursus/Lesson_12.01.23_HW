package transport;

import transport.Car;

public class Main {
    public static void main(String[] args) {
        DriveB driveB = new DriveB("Иван Падерин", true, 12);
        Car car1 = new Car("Lada",
                "Granta",
                1.6,
                driveB);
        printInfo(car1);

        DriverD driverD = new DriverD("Олег Газманов", true, 22);
        Bus bus1 = new Bus("ЛИАЗ",
                "677",
                5.0,
                driverD);
        printInfo(bus1);

        DriverC driverC = new DriverC("Тимур Кизяков", true, 18);
        Truck truck1 = new Truck("КАМАЗ",
                "65225",
                6.0,
                driverC);
        printInfo(truck1);

        DriverC driverC2 = new DriverC("Иван Зилов", true, 18);
        Truck truck2 = new Truck("КАМАЗ",
                "65225",
                6.0,
                driverC2);
        printInfo(truck2);
    }
    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDrive().getName() + " управляет автомобилем " +transport.getBrand() + " и будет участвовать в заезде");
    }
}