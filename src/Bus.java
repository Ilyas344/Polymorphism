import java.util.Objects;

public class Bus extends Transport<DriverD> {


    public Bus(String brand, String model, Double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {

        return "Автобус " + super.toString();

    }

    @Override
    public String startMoving() {
        return null;
    }

    @Override
    public String endMoving() {
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }


}