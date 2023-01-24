import java.util.ArrayList;
import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean isDriversLicense;
    private Integer experience;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return isDriversLicense == driver.isDriversLicense && Objects.equals(fullName, driver.fullName) && Objects.equals(experience, driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, isDriversLicense, experience);
    }

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

    public boolean getIsDriversLicense() {
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
        String licence;
        if (isDriversLicense) {
            licence = ", с вод. правами";
        } else {
            licence = ", без вод. прав";
        }
        return "Водитель: " +
                fullName + licence +
                ", опыт вождения: " + experience;
    }
}
