import java.util.ArrayList;

public abstract class Driver {
    private String fullName;
    private boolean isDriversLicense;
    private Integer experience;
    private ArrayList<Driver> driverArrayList;

    public Driver(String fullName, boolean isDriversLicense, Integer experience) {
        this.fullName = fullName;
        this.isDriversLicense = isDriversLicense;
        this.experience = experience;
    }

    public ArrayList<Driver> getDriverArrayList() {
        return driverArrayList;
    }

    public void setDriverArrayList(ArrayList<Driver> driverArrayListtArrayList) {
        this.driverArrayList = driverArrayListtArrayList;
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
