package transport;

public class Bus extends Transport<DriverD> {
    public enum Сapacity{
        N1 (7),
        N2 (12),
        N3 (27),
        N4 (77),
        N5 (111),
        N6 (123);
        private int range;

        Сapacity(int range) {
            this.range = range;
        }

        @Override
        public String toString() {
            if (0 <= range && range <= 10){
                return "Вместимость: от 0 до 10 человек";
            }
            if (10 < range && range <= 25){
                return "Вместимость: от 11 до 25 человек";
            }
            if (25 < range && range <= 50){
                return "Вместимость: от 26 до 50 человек";
            }
            if (50 < range && range <= 80){
                return "Вместимость: от 51 до 80 человек";
            }
            if (80 < range && range <= 120){
                return "Вместимость: от 81 до 120 человек";
            }
            else {
                return "Необходимо несколько автобусов";
            }
        }
    }



    public Bus(String brand,
               String model,
               double engineCapacity,
               DriverD drive, Type type) {
        super(brand, model, engineCapacity, drive, type);
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