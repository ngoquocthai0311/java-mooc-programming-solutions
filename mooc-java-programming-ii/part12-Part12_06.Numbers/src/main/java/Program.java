
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        final int range = 11;
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        
        System.out.println("How many random numbers should be printed?");
        int input = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < input; i++) {
            System.out.println(random.nextInt(range));
        }       
    }

}
