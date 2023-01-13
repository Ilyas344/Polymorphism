
import java.util.Objects;

public class Car extends Transport<DriverB> {


    public Car(String brand, String model, Double engineVolume, DriverB driver) {
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

        return "Автомобиль " + super.toString();

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }


}