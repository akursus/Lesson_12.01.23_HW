package transport;

public class Truck extends Transport<DriverC> {
    public LoadСapacity loadСapacity;
    public enum LoadСapacity {
        N1 (0.0F, 3.5F),
        N2 (3.6F, 12F),
        N3 (12.1F, 26F);
        private float min;
        private float max;

        LoadСapacity(float min, float max) {
            this.min = min;
            this.max = max;
        }

        public float getMin() {
            return min;
        }

        public float getMax() {
            return max;
        }

        public static LoadСapacity getValue(float value) {
            for (LoadСapacity e : LoadСapacity.values()) {
                if (value >= e.getMin() && value <= e.getMax()) {
                    System.out.println(e);
                    return e;
                }
            }
            return null;
        }

    }

    public Truck(String brand, String model, double engineCapacity, DriverC drive, Type type, LoadСapacity loadСapacity) {
        super(brand, model, engineCapacity, drive, type);
        this.loadСapacity = loadСapacity;
    }

    public LoadСapacity getLoadСapacity() {
        return loadСapacity;
    }

    public void setLoadСapacity(LoadСapacity loadСapacity) {
        this.loadСapacity = loadСapacity;
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

    public void printType() {
        if (getLoadСapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadСapacity());
        }
    }

    public boolean passDiagnostics() {
        return this.isDiagnosticsPassed ();
    }
}
