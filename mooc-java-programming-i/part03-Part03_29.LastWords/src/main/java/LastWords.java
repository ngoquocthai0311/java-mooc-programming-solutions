
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();           
            if (word.equals("")) {
                break;
            }
            
            String[] splitted = word.split(" ");
            System.out.println(splitted[splitted.length - 1]);
        }
    }
}
