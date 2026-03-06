import java.util.Date;

public interface laptop {
    String model = "";
    String brand = "";
    String color = "";
    String os = "";
    int ram = 0;
    int memory = 0;
    double price = 0;
    Date mDate = null;


    public String getOS();
    public boolean checkWarranty();
}
