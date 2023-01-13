import java.util.Objects;

public class Trucks extends Transport<DriverC> {
    public enum Payload {
        N1(0, 3.5f),
        N2(3.5f, 12),
        N3(12, Float.MAX_VALUE);

        private final float n1 = (float) 3.5;
        private final float n2 = (float) 12;

        private final float m1;
        private final float m2;


        Payload(float m1, float m2) {
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
            if (n2 == m1) {
                return "Грузоподъемность: до " + n1 + " тонн";
            }
            if (n1 == m1) {
                return "Грузоподъемность: от " + n1 + " тонн до " + n2 + " тонн";
            } else {
                return "Грузоподъемность: от " + n2 + " тонн";
            }
        }

        public float getN1() {
            return n1;
        }

        public float getN2() {
            return n2;
        }
    }

    public Trucks(String brand, String model, Double engineVolume, DriverC driver, Payload payload) {
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
    public void printType(String payload) {
        switch (Trucks.Payload.valueOf(payload)) {
            case N1:
                System.out.println(Payload.N1);
                break;
            case N2:
                System.out.println(Payload.N2);
                break;
            case N3:
                System.out.println(Payload.N3);
                break;
            default:
                System.out.println("Данных по транспортному средству недостаточно");
                break;

        }


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
