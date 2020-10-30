
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();       
        // implement here a program, that first reads user input
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            // adding them on a list until user gives -1.
            if (num == -1) {
                break;
            }
            list.add(num);
        }
        
        // Then it computes the average of the numbers on the list
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        // and prints it.
        System.out.println("Average: " + (1.0 * sum / list.size()));
        
    }
}
