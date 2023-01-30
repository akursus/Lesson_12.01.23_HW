package transport;

public class Car extends Transport{
    private double engineVolume;
    private String transmission;
    final private String bodyType;
    private String registrationNumber;
    final private int numberOfSeats;
    private boolean isSummerRubber;
    private Key key;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               int maxSpeed,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean isSummerRubber,
               Key key) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = (engineVolume > 0) ? engineVolume : 1.5;
        this.transmission = (transmission != null && transmission.isEmpty() != true && transmission.isBlank() != true) ? transmission : "Default";;
        this.bodyType = (bodyType != null && bodyType.isEmpty() != true && bodyType.isBlank() != true) ? bodyType : "Default";;
        this.registrationNumber = (registrationNumber != null && registrationNumber.isEmpty() != true && registrationNumber.isBlank() != true) ? registrationNumber : "Default";;
        this.numberOfSeats = (numberOfSeats > 0) ? numberOfSeats : 5;
        this.isSummerRubber = isSummerRubber;
        this.key = key;
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessEntry;

        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }

        @Override
        public String toString() {
            return "удаленный запуск двигателя - " + remoteStart +
                    ", бесключевой доступ - " + keylessEntry;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            isSummerRubber = false;
        }
        if (month >= 4 && month <= 10) {
            isSummerRubber = true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "объем двигаеля в литрах: " + engineVolume + ", " +
                "коробка передач: " + transmission + ", " +
                "тип кузова: " + bodyType + ", " +
                "регистрационный номер: " + registrationNumber + ", " +
                "количество мест: " + numberOfSeats + ", " +
                (isSummerRubber ? "летняя" : "зимняя") + " резина"+ ", " +
                key;
    }
}
