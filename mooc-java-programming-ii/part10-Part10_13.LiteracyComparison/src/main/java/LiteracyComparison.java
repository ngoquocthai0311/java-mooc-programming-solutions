import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        final String path = "literacy.csv";              
        ArrayList<Literacy> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(path)).map(row -> row.split(",")).map(parts -> new Literacy(parts[3], Integer.valueOf(parts[4]), parts[2].trim().substring(0, parts[2].length() - 5), Double.valueOf(parts[5]))).forEach(each -> list.add(each));
            list.stream().sorted().forEach(each -> System.out.println(each));
            // Afghanistan (2015), female, 23.87385
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
