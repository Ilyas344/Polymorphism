import java.util.Objects;

public class Bus extends Transport<DriverD> {

    enum Сapacity {
        ESPECIALLY_SMALL("особо малая", 0, 10),
        SMALL("малая", 0, 25),
        AVERAGE("средняя", 40, 50),
        LARGE("большая", 60, 80),
        ESPECIALLY_LARGE("особо большая", 100, 120);

        private String capacity;
        private Integer place1;
        private Integer place2;
        final Integer pl1 = 0;


        Сapacity(String capacity, Integer place1, Integer place2) {
            this.capacity = capacity;
            this.place1 = place1;
            this.place2 = place2;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }

        public Integer getPlace1() {
            return place1;
        }

        public void setPlace1(Integer place1) {
            this.place1 = place1;
        }

        public Integer getPlace2() {
            return place2;
        }

        public void setPlace2(Integer place2) {
            this.place2 = place2;
        }

        public Integer getPl1() {
            return pl1;
        }

        @Override
        public String toString() {
            if (place1 == pl1) {
                return "Вместимость: до " + place2 + " мест";
            } else {
                return "Вместимость: " + place1 + " - " + place2 + " мест";
            }

        }
    }

    public Bus(String brand, String model, Double engineVolume, DriverD driver, Сapacity capacity) {
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

    // @Override
    public void printType(String capacity) {
        switch (Bus.Сapacity.valueOf(capacity)) {
            case LARGE:
                System.out.println(Bus.Сapacity.LARGE);
                break;
            case SMALL:
                System.out.println(Bus.Сapacity.SMALL);
                break;
            case AVERAGE:
                System.out.println(Сapacity.AVERAGE);
                break;
            case ESPECIALLY_LARGE:
                System.out.println(Сapacity.ESPECIALLY_LARGE);
                break;
            case ESPECIALLY_SMALL:
                System.out.println(Сapacity.ESPECIALLY_SMALL);
                break;
            default:
                System.out.println("Данных по транспортному средству недостаточно");
                break;

        }


    }
}


