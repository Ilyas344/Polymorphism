public class Main {
    public static void main(String[] args) throws Exception {
        DriverB driverB = new DriverB("Александр", true, 5);
        DriverC driverC = new DriverC("Алексей", true, 5);
        DriverD driverD = new DriverD("Валерий", true, 5);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", (3.0), driverB, Car.BodyType.SEDAN);
        Car bmw = new Car("BMW", "Z8", (3.0), Car.BodyType.VAN);
        Car kia = new Car("Kia", "Sportage 4-го поколения", (2.4), driverB, Car.BodyType.MINIVAN);
        Car hyundai = new Car("Hyundai", "Santa Fe", 1.6, driverB, Car.BodyType.CROSSOVER);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println();
        Bus paz = new Bus("ПАЗ", "3205", 5.0, driverD, Bus.Сapacity.ESPECIALLY_SMALL);
        Bus maz = new Bus("МАЗ", "241", 4.0, driverD, Bus.Сapacity.SMALL);
        Bus liaz = new Bus("ЛИАЗ", "677", 3.0, driverD, Bus.Сapacity.ESPECIALLY_LARGE);
        Bus liaz3 = new Bus("ЛИАЗ", "654", 3.0, driverD, Bus.Сapacity.AVERAGE);
        System.out.println(paz);
        System.out.println(maz);
        System.out.println(liaz);
        System.out.println(liaz3);
        System.out.println();
        Trucks volvo = new Trucks("Вольво", "FH16", 5.0, driverC, Trucks.Payload.N1);
        Trucks volvo1 = new Trucks("Вольво", "FH10", 5.0, driverC, Trucks.Payload.N2);
        Trucks volvo2 = new Trucks("Вольво", "FH12", 5.0, driverC, Trucks.Payload.N3);
        Trucks volvo3 = new Trucks("Вольво", "FL7", 5.0, driverC, Trucks.Payload.N1);
        System.out.println(volvo);
        System.out.println(volvo1);
        System.out.println(volvo2);
        System.out.println(volvo3);
        System.out.println("Лучшее время курга для " + audi.getBrand() + " " + audi.getModel() + " " + audi.getBestLapTime());
        System.out.println("Максимальная скорость " + audi.getMaxSpeed());
        audi.getPitStop();
        System.out.println("Лучшее время курга для " + paz.getBrand() + " " + paz.getModel() + " " + paz.getBestLapTime());
        System.out.println("Максимальная скорость " + paz.getMaxSpeed());
        paz.getPitStop();
        System.out.println("Лучшее время курга для " + volvo.getBrand() + " " + volvo.getModel() + " " + volvo.getBestLapTime());
        System.out.println("Максимальная скорость " + volvo.getMaxSpeed());
        volvo.getPitStop();
        printInfo(paz);
        printInfo(volvo);
        printInfo(audi);
        paz.printType();
        volvo.printType();
        maz.printType();
        volvo1.printType();
        liaz.printType();
        volvo2.printType();
        liaz3.printType();
        volvo3.printType();
        audi.printType();
        volvo.passDiagnostics();
        audi.passDiagnostics();
        // paz.passDiagnostics();
        bmw.passDiagnostics();


    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в гонке");
    }
}
