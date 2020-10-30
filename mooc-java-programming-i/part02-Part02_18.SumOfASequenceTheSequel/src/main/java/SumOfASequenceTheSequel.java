
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // my code goes here 
        System.out.print("First number? ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int end = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
