
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String name = "";
        while (true) {
            String data = scanner.nextLine();           
            if (data.equals("")) {
                break;
            }
            
            String[] splitted = data.split(",");
            if (Integer.valueOf(splitted[1]) > max) {
                max = Integer.valueOf(splitted[1]);
                name = splitted[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
