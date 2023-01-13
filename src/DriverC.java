public class DriverC extends Driver {
    public DriverC(String fullName, boolean isDriversLicense, Integer experience) {
        super(fullName, isDriversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории С " + getFullName() + " начал движение ");
    }

    @Override
    public void endMoving() {
        System.out.println("Машина глохнет");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель " + getFullName() + " заправляет машину");
    }
}
