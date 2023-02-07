package transport;

public class Truck extends Transport<DriverC> {
    public Truck(String brand,
                 String model,
                 double engineCapacity,
                 DriverC drive) {
        super(brand, model, engineCapacity, drive);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик " + getBrand() + " закончил движение");
    }
    @Override
    public void pitStop(){
        System.out.println("Пит-стоп у грузовика" + getBrand());
    }

    @Override
    public void bestLapTime(){
        int minLimit = 5;
        int maxLimit = 7;
        int bestLapTime = (int) (minLimit + (maxLimit - minLimit)*Math.random());
        System.out.println("Лучшее время круга грузовика: " + bestLapTime + "мин.");
    }

    @Override
    public void maxSpeed(){
        int minLimit = 90;
        int maxLimit = 150;
        int maxSpeed = (int) (minLimit + (maxLimit - minLimit)*Math.random());
        System.out.println("Максимальная скорость грузовика: " + maxSpeed + "км/ч");
    }
}
