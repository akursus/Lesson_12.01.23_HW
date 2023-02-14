package transport;

public class Main {
    private static Enum<Type> printType;

    public static void main(String[] args) {
        Transport<?>transport; printType = Type.BUS;
            System.out.println(printType);

        Bus.Сapacity сapacity = Bus.Сapacity.N5;
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
                Type.CAR,
                Car.BodyType.TYPE1);
        printInfo(car1);

        DriverD driverD = new DriverD("Олег Газманов", true, 22);
        Bus bus1 = new Bus("ЛИАЗ",
                "677",
                5.0,
                driverD,
                Type.BUS,
                Bus.Сapacity.getValue(12));
        printInfo(bus1);
        bus1.printType();

        DriverC driverC = new DriverC("Тимур Кизяков", true, 18);
        Truck truck1 = new Truck(
                "65225", "ЛИАЗ", 6.0, driverC, Type.TRUCK, Truck.LoadСapacity.getValue(12));
        printInfo(truck1);
        truck1.printType();

        DriverC driverC2 = new DriverC("Иван Зилов", true, 18);
        Truck truck2 = new Truck(
                "65225", "ЛИАЗ", 6.0, driverC2, Type.TRUCK, Truck.LoadСapacity.getValue(12));
        printInfo(truck2);
        truck2.printType();
    }
    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDrive().getName() + " управляет автомобилем " +transport.getBrand() + " и будет участвовать в заезде");
    }
}