import java.util.Objects;

public class Trucks extends Transport<DriverC> {
    public Trucks(String brand, String model, Double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
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
    public String toString() {

        return "Грузовой автомобиль " + super.toString();

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }


}
