
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here              
        int x = 2;
        int y = 3;
        swap(x,y);
        System.out.println(x+" "+y);
    }
    
    public static void swap(Integer num1, Integer num2) {
        Integer temp = num1;
        num1 = num2;
        num2 = num1;
    }            
    public static List<Integer> positive(List<Integer> list) {
        List<Integer> positives = new ArrayList<>();
        positives = list.stream().filter(s -> s > 0).collect(Collectors.toCollection(ArrayList::new));
        return positives;
    }

}
