import java.util.ArrayList;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {

    private final String brand;
    private final String model;
    private Double engineVolume;
    private T driver;
    private ArrayList<Transport> transportArrayList;

    public Transport(String brand, String model, Double engineVolume, T driver) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default brand";
        } else {
            this.brand = brand;
        }


        if (model == null || model.isEmpty()) {
            this.model = "default model";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        setDriver(driver);

    }

    public Transport(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public ArrayList<Transport> getTransportArrayList() {
        return transportArrayList;
    }

    public void setTransportArrayList(ArrayList<Transport> transportArrayList) {
        this.transportArrayList = transportArrayList;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void printType();


    @Override
    public String toString() {
        return ": " + brand + " " + model +
                ", мощность двигателя " + engineVolume;
    }

    public abstract String startMoving();

    public abstract String endMoving();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(engineVolume, transport.engineVolume);
    }

    public abstract void passDiagnostics() throws Exception;


    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public void getPitStop() {
        System.out.println("Пит стоп для " + getBrand() + " " + getModel());
    }

    @Override
    public Double getBestLapTime() {
        return (getMaxSpeed() * 1000);
    }

    @Override
    public Double getMaxSpeed() {
        return getEngineVolume() * 50;
    }

}