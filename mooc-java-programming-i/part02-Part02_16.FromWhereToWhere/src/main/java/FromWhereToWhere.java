
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Part 1
        System.out.print("Where to? ");
        int limit = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
        // Part 2
        System.out.print("Where to? ");
        int upper = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int lower = Integer.valueOf(scanner.nextLine());
        if (lower <= upper) {
            for (int i = lower; i <= upper; i++) {
                System.out.println(i);
            } 
        }                      
    }
}
