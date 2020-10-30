
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (true) {
            String data = scanner.nextLine();           
            if (data.equals("")) {
                break;
            }
            
            String[] splitted = data.split(",");
            if (Integer.valueOf(splitted[1]) > max) {
                max = Integer.valueOf(splitted[1]);
            }
        }
        System.out.println("Age of the oldest: " + max);
    }
}
