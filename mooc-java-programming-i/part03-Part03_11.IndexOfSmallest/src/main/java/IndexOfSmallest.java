
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }                       
            list.add(input);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int size = list.size();
        // find the smallest
        int smallest = list.get(0);
        for (int i = 1; i < size; i++) {
            int num = list.get(i);
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest number: " + smallest);
        // find the indices
        for (int i = 0; i < size; i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
