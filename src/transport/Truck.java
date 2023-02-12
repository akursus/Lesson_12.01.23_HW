package transport;

public class Truck extends Transport<DriverC> {

    public enum LoadСapacity{
        N1 (3.2F),
        N2 (10.7F),
        N3 (12.7F);
        private float range;

        LoadСapacity(float range) {
            this.range = range;
        }

        @Override
        public String toString() {
            if (0.0F <= range && range <= 3.5F){
                return "Грузоподъемность: от 0 тонн до 3.5 тонн";
            }
            if (3.5F < range && range <= 12F){
                return "Грузоподъемность: от 3.5 тонн до 12 тонн";
            }
            if (12F < range && range <= 26F){
                return "Грузоподъемность: от 12 тонн до 26 тонн";
            }
            else {
                return "Грузоподъемность: не соответствует грузоподьемности транспорта";
            }
        }
    }


    public Truck(String brand,
                 String model,
                 double engineCapacity,
                 DriverC drive, Type type) {
        super(brand, model, engineCapacity, drive, type);
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
