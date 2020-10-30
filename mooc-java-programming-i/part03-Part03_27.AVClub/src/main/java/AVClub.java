
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();           
            if (word.equals("")) {
                break;
            }
            
            String[] splitted = word.split(" ");
            for (int i = 0; i < splitted.length; i++) {
                if (splitted[i].contains("av")) {
                    System.out.println(splitted[i]);
                }
            }
        }
    }
}
