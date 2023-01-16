import java.util.Objects;

public class Bus extends Transport<DriverD> {
    private Сapacity capacity;

    enum Сapacity {
        ESPECIALLY_SMALL("особо малая", null, 10),
        SMALL("малая", null, 25),
        AVERAGE("средняя", 40, 50),
        LARGE("большая", 60, 80),
        ESPECIALLY_LARGE("особо большая", 100, 120);

        private String capacity;
        ;
        private Integer place1;
        private Integer place2;


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


        @Override
        public String toString() {
            if (place1 == null) {
                return " вместимость: до " + place2 + " мест";
            } else {
                return " вместимость: " + place1 + " - " + place2 + " мест";
            }

        }
    }

    public Bus(String brand, String model, Double engineVolume, DriverD driver, Сapacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return capacity == bus.capacity;
    }

    @Override
    public String toString() {

        return "Автобус " + super.toString() + capacity.toString();

    }

    public Сapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Сapacity capacity) {
        this.capacity = capacity;
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

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Автобус " + getBrand() + " " + capacity);
        }

    }

    @Override
    public void passDiagnostics() throws CheckDriversException {
        try {
            System.out.println("Водитель " + getDriver().getFullName() + " автобуса " + getBrand() + " имеет права своей категории");
        } catch (CheckDriversException e) {
            throw new NullPointerException("Водитель без прав");
        } finally {
            if (getClass() == Bus.class)
                throw new RuntimeException("Автобусы диагностику проходить не могут");
        }
    }
}





