package transport;

public class Car extends Transport<DriveB> {
    public Car(String brand,
               String model,
               double engineCapacity,
               DriveB drive) {
        super(brand, model, engineCapacity, drive);
    }

    @Override
    public void startMove() {
        System.out.println("Легковой автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Легковой автомобиль " + getBrand() + " закончил движение");
    }
    @Override
    public void pitStop(){
        System.out.println("Пит-стоп у легкового автомобиля" + getBrand());
    }

    @Override
    public void bestLapTime(){
        int minLimit = 3;
        int maxLimit = 5;
        int bestLapTime = (int) (minLimit + (maxLimit - minLimit)*Math.random());
        System.out.println("Лучшее время круга легкового автомобиля: " + bestLapTime + "мин.");
    }

    @Override
    public void maxSpeed(){
        int minLimit = 100;
        int maxLimit = 200;
        int maxSpeed = (int) (minLimit + (maxLimit - minLimit)*Math.random());
        System.out.println("Максимальная скорость легкового автомобиля: " + maxSpeed + "км/ч");
    }

}