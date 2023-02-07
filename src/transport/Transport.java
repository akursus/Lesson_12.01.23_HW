package transport;

public abstract class Transport <T extends Drive> implements Competition{
    private final String brand;
    private final String model;
    private double engineCapacity;
    private T drive;

    public Transport(String brand,
                     String model,
                     double engineCapacity,
                     T drive) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            model = "default";
        }
        this.model = model;

        setEngineCapacity(engineCapacity);
        setDrive(drive);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0) {
            engineCapacity = 1.6;
        }
        this.engineCapacity = engineCapacity;
    }

    public T getDrive() {
        return drive;
    }

    public void setDrive(T drive) {
        this.drive = drive;
    }

    public abstract void startMove ();
    public abstract void finishMove ();
    @Override
    public String toString() {
        return "Марка: " + brand + ", " +
                "модель: " + model + ", " +
                "объём двигателя: " + engineCapacity;
    }
}





