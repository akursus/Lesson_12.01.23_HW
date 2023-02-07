package transport;

public class DriverC extends Drive{
    public DriverC(String name,
                   boolean driverLicense,
                   int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C " + getName() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории C " + getName() + " прекратил движение");
    }

    @Override
    public void refueling() {
        System.out.println("Водитель категории C " + getName() + " заправляет автомобиль");
    }
}
