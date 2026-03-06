import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class fileHandle {
    public void ScannerWay(){
        String filePath = "name.txt";
        File f = new File(filePath);
        try {
            Scanner sc = new Scanner(f);
            if (!sc.hasNext()) {
                System.out.println("No data foiund" + filePath);
            }
            while (sc.hasNext()) {
                System.out.print(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        
        try {
            FileReader fr = new FileReader(new File("name.txt"));
            while(fr.ready()){
                System.out.print((char)fr.read());
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        File f = new File("names1.txt");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write("Abhinav Hello");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
