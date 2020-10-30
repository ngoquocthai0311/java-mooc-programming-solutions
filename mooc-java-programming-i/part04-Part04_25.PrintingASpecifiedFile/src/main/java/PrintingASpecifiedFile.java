
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ask for the input
        System.out.println("Which file should have its contents printed?");
        String opt = scanner.nextLine();
        
        readFileTxt(opt);
    }
    
    public static void readFileTxt(String path) {
        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }            
    }
}
