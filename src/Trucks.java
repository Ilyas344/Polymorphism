import java.util.Objects;

public class Trucks extends Transport<DriverC> {
    private Payload payload;

    public enum Payload {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);


        private final Float m1;
        private final Float m2;


        Payload(Float m1, Float m2) {
            this.m1 = m1;
            this.m2 = m2;

        }

        public float getM1() {
            return m1;
        }


        public float getM2() {
            return m2;
        }


        @Override
        public String toString() {
            if (m1 == null) {
                return " грузоподъемность: до " + m2 + " тонн";
            }
            if (m1 != null && m2 != null) {
                return " грузоподъемность: от " + m1 + " тонн до " + m2 + " тонн";
            } else {
                return " грузоподъемность: от " + m1 + " тонн";
            }
        }

    }

    public Trucks(String brand, String model, Double engineVolume, DriverC driver, Payload payload) {
        super(brand, model, engineVolume, driver);
        this.payload = payload;

    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
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
    public void printType() {
        if (payload == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Грузовой автомобиль " + getBrand() + " " + payload);
        }
    }

    @Override
    public void passDiagnostics() {
        try {
            System.out.println("Грузовой втомобиль " + getBrand() + " проходит диагностику");
            System.out.println("Водитель " + getDriver().getFullName() + " автомобиля " + getBrand() + " имеет права своей категории");
        } catch (CheckDriversException e) {
            throw new NullPointerException("Необходимо указать тип прав");
        }
    }

    @Override
    public String toString() {

        return "Грузовой автомобиль " + super.toString() + payload.toString();

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }


}
