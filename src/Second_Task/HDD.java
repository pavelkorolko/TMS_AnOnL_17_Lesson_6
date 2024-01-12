package Second_Task;

public class HDD {
    private String name;
    private double volume;
    private HDDType hddType;

    public HDD() {
    }

    public HDD(String name, double volume, HDDType hddType) {
        this.name = name;
        this.volume = volume;
        this.hddType = hddType;
    }

    @Override
    public String toString() {
        return "HDD " + name + " volume: " + volume + ", and  type: " + hddType;
    }
}
