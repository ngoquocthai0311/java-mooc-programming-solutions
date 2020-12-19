
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Test your code here!
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }
    
    public static int returnSize (List<String> items) {
        return items.size();
    }
}
