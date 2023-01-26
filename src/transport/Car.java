package transport;

public class Car {
    final private String brand;
    final private String model;
    private double engineVolume;
    private String color;
    final private int year;
    final private String country;
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
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean isSummerRubber,
               Key key) {
        this.brand = (brand != null && brand.isEmpty() != true && brand.isBlank() != true) ? brand : "Default";
        this.model = (model != null && model.isEmpty() != true && model.isBlank() != true) ? model : "Default";
        this.engineVolume = (engineVolume > 0) ? engineVolume : 1.5;
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? model : "белый";
        this.year = (year > 0) ? year : 2000;
        this.country = (country != null && country.isEmpty() != true && country.isBlank() != true) ? country : "Default";
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
            return "Удаленный запуск двигателя - " + remoteStart +
                    ", бесключевой доступ - " + keylessEntry;
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
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
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", isSummerRubber=" + isSummerRubber +
                ", key=" + key +
                '}';
    }
}
