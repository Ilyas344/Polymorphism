
import java.util.Objects;

public class Car extends Transport<DriverB> {
    private BodyType bodyType;

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {

            return bodyType;
        }


        @Override
        public String toString() {
            return " тип кузова " + getBodyType();
        }
    }


    public Car(String brand, String model, Double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    public Car(String brand, String model, Double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public String startMoving() {
        return null;
    }

    @Override
    public String endMoving() {
        return null;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Легковой автомобиль " + getBrand() + bodyType);
        }


    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString() + bodyType.toString();

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public void passDiagnostics() {
        try {
            System.out.println("Автомобиль " + getBrand() + " проходит диагностику");
            System.out.println("Водитель " + getDriver().getFullName() + " автомобиля " + getBrand() + " имеет права своей категории");
        } catch (CheckDriversException e) {
            throw new NullPointerException("Необходимо указать тип прав");
        }
    }
}