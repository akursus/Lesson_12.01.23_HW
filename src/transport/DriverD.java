package transport;

public class DriverD extends Drive {
    public DriverD(String name,
                   boolean driverLicense,
                   int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getName() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории D " + getName() + " прекратил движение");
    }

    @Override
    public void refueling() {
        System.out.println("Водитель категории D " + getName() + " заправляет автомобиль");
    }
}
