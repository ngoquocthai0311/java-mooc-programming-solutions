
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeList list = new GradeList();
        UserInterface ui = new UserInterface(scanner, list);
        
        ui.start();
    }
}
