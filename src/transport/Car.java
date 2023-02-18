package transport;

public class Car extends Transport<DriveB> {
public BodyType bodyType;
    public enum BodyType {
        TYPE1("Седан"),
        TYPE2("Хетчбэк"),
        TYPE3("Купе"),
        TYPE4("Универсал"),
        TYPE5("Внедорожник"),
        TYPE6("Кроссовер"),
        TYPE7("Пикап"),
        TYPE8("Фургон"),
        TYPE9("Минивэн");

        private String name;
        BodyType (String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + name;
        }
    }

    public Car(String brand,
               String model,
               double engineCapacity,
               DriveB drive,
               Type type,
               BodyType bodyType) {
        super(brand, model, engineCapacity, drive, type);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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

    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType());
        }
    }

    @Override
    public boolean passDiagnostics() {
        return this.isDiagnosticsPassed ();
    }
}