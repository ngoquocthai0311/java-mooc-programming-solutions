
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int max = 0;
        String name = "";
        while (true) {
            String data = scanner.nextLine();           
            if (data.equals("")) {
                break;
            }
            
            String[] splitted = data.split(",");
            if (splitted[0].length() > max) {
                max = splitted[0].length();
                name = splitted[0];
            }
            sum += Integer.valueOf(splitted[1]);
            count++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));        
    }
}
