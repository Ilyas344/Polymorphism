public class CheckDriversException extends NullPointerException {
    private final Driver driver;

    public CheckDriversException(String message, Driver driver) {
        super(message);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}
