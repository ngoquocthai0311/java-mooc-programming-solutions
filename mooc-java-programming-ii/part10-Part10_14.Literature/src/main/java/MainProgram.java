
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        while (true) {
            
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            list.add(new Book(name, age));
        }
        
        System.out.println(list.size() +" books in total.");
        Comparator<Book> comparator = Comparator.comparing(Book::getRecommendedYear).thenComparing(Book::getName);
        Collections.sort(list, comparator);
        
        list.stream().forEach(each ->System.out.println(each));
    }

}
