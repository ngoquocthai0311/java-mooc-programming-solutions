
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // my code goes here 
        System.out.print("Last number? ");
        int limit = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }            
        System.out.println("The sum is " + sum);
    }
}
