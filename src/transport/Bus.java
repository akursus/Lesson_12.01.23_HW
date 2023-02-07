package transport;

public class Bus extends Transport<DriverD> {
    public Bus(String brand,
               String model,
               double engineCapacity,
               DriverD drive) {
        super(brand, model, engineCapacity, drive);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop(){
        System.out.println("Пит-стоп у автобуса" + getBrand());
    }

    @Override
    public void bestLapTime(){
        int minLimit = 7;
        int maxLimit = 9;
        int bestLapTime = (int) (minLimit + (maxLimit - minLimit)*Math.random());
        System.out.println("Лучшее время круга автобуса: " + bestLapTime + "мин.");
    }

    @Override
    public void maxSpeed(){
        int minLimit = 70;
        int maxLimit = 120;
        int maxSpeed = (int) (minLimit + (maxLimit - minLimit)*Math.random());
        System.out.println("Максимальная скорость автобуса: " + maxSpeed + "км/ч");
    }
}