
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            numbers.add(num);
        }
        // print the added numbers in the list 
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
