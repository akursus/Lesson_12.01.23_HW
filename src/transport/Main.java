package transport;

import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                180,
                "АКП",
                "седан",
                "А357МР97",
                5,
                true,
                new Car.Key(true, true));
        System.out.println(car1);



    }
}