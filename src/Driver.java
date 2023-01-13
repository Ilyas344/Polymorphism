public abstract class Driver {
    private String fullName;
    private boolean isDriversLicense;
    private Integer experience;

    public Driver(String fullName, boolean isDriversLicense, Integer experience) {
        this.fullName = fullName;
        this.isDriversLicense = isDriversLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriversLicense() {
        return isDriversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        isDriversLicense = driversLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }


    public abstract void startMoving();


    public abstract void endMoving();

    public abstract void refuel();

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", isDriversLicense=" + isDriversLicense +
                ", experience=" + experience +
                '}';
    }
}
