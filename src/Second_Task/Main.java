package Second_Task;

public class Main {
    public static void main(String[] args) {
        Computer comp_1 = new Computer("LENOVO", 1_500);
        System.out.println(comp_1);

        HDD hdd = new HDD("ST2000DL003", 50, HDDType.External);
        RAM ram = new RAM("DDR3 SDRAM", 4);
        Computer comp_2 = new Computer("DELL", 2_500, ram, hdd);
        System.out.println(comp_2);
    }
}
