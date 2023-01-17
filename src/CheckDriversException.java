public class CheckDriversException extends Exception {
    private final Driver driver;


    public CheckDriversException(String message, Driver driver) {
        super(message);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}
