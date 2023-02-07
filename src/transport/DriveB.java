package transport;

public class DriveB extends Drive{
    public DriveB(String name,
                  boolean driverLicense,
                  int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В " + getName() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории В " + getName() + " прекратил движение");
    }

    @Override
    public void refueling() {
        System.out.println("Водитель категории В " + getName() + " заправляет автомобиль");
    }
}
