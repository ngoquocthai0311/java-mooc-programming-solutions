
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the data file:");        
        String file = scanner.nextLine();
        
        // reading the file 
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                
                String personInfo[] = row.split(",");
                System.out.print(personInfo[0]);                
                if (Integer.valueOf(personInfo[1]) == 1) {
                    System.out.println(", age: " + personInfo[1] + " year");
                } else {
                    System.out.println(", age: " + personInfo[1] + " years");
                }
            }                   
        } catch (Exception e) {
            System.out.println("");
        }
    }
}
