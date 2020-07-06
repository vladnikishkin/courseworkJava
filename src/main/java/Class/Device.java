package Class;

public class Device implements Interface.Device {
    private String model;
    private String version;
    private int repairCode;
    private String time;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getRepairCode() {
        return repairCode;
    }

    public void setRepairCode(int repairCode) {
        this.repairCode = repairCode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
