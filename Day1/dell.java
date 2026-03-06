import java.util.Date;

public class dell implements laptop {
     String model = "";
    String brand = "";
    String color = "";
    String os = "";
    int ram = 0;
    int memory = 0;
    double price = 0;
    Date mDate = null;


    public dell(String model, String brand, String color, String os, int ram, int memory, double price, Date mDate) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.memory = memory;
        this.price = price;
        this.mDate = mDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public dell() {
    }

    @Override
    public String getOS() {
        return os;
    }

    @Override
    public boolean checkWarranty() {
        return true;
    }
    
    public static void main(String[] args) {
        dell l1 = new dell();
        l1.setOs("Windows");
        System.out.println(l1.getOS());
        System.out.println(l1.checkWarranty());
    }
}
