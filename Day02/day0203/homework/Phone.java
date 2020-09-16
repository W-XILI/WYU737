package Day02.day0203.homework;

public class Phone {
    private int screenSize;
    private String brand;
    private String cpu;
    private int memory;

    public int getMemory() {
        return memory;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
