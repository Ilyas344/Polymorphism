public class DriverD  extends Driver{


    public DriverD(String fullName, boolean isDriversLicense, Integer experience) {
        super(fullName, isDriversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D "+getFullName()+" начал движение ");
    }

    @Override
    public void endMoving() {
        System.out.println("Машина глохнет");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель "+getFullName()+" заправляет машину");
    }
}
