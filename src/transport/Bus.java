package transport;

public class Bus extends Transport<DriverD> {
    public Сapacity сapacity;
    public enum Сapacity{
        N1 (0, 10),
        N2 (11, 25),
        N3 (26, 50),
        N4 (51, 80),
        N5 (81, 120);

        private int min;
        private int max;

        Сapacity(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        public static Сapacity getValue(int value) {
            for (Сapacity e : Сapacity.values()) {
                if (value >= e.getMin() && value <= e.getMax()) {
                    System.out.println(e);
                    return e;
                }
            }
            return null;
        }
    }

    public Bus(String brand, String model, double engineCapacity, DriverD drive, Type type, Сapacity сapacity) {
        super(brand, model, engineCapacity, drive, type);
        this.сapacity = сapacity;
    }

    public Сapacity getСapacity() {
        return сapacity;
    }

    public void setСapacity(Сapacity сapacity) {
        this.сapacity = сapacity;
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

    public void printType() {
        if (getСapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getСapacity());
        }
    }

    public boolean passDiagnostics() {
       throw new TransportTypeException ("Автобусы диагностику проходить не должны");
    }
}