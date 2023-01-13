
import java.util.Objects;

public class Car extends Transport<DriverB> {

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
    public void printType(String bodyType) {
        switch (Car.BodyType.valueOf(bodyType)) {
            case SEDAN:
                System.out.println(BodyType.SEDAN);
                break;
            case HATCHBACK:
                System.out.println(BodyType.HATCHBACK);
                break;
            case STATION_WAGON:
                System.out.println(BodyType.STATION_WAGON);
                break;
            case VAN:
                System.out.println(BodyType.VAN);
                break;
            case MINIVAN:
                System.out.println(BodyType.MINIVAN);
                break;
            case PICKUP:
                System.out.println(BodyType.PICKUP);
                break;
            case CROSSOVER:
                System.out.println(BodyType.CROSSOVER);
                break;
            case COUPE:
                System.out.println(BodyType.COUPE);
                break;
            case SUV:
                System.out.println(BodyType.SUV);
                break;
            default:
                System.out.println("Данных по транспортному средству недостаточно");
                break;

        }
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