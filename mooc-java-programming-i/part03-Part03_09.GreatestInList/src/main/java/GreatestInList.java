
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        // find the greates number in the list 
        int max = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int num = list.get(i);
            if (max < num) {
                max = num;
            }
        }
        System.out.println("The greatest number: " + max);
    }
}
