
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String part[] = input.split(" ");
            int amount = Integer.valueOf(part[1]);
            
            if (part[0].equals("add")) { 
                first.add(amount);                                    
            } 
            
            if (part[0].equals("move")) {                             
                int temp = first.contains() - amount;
                System.out.println(temp);
                if (temp < 0) {                    
                    amount += temp;
                }
                first.remove(amount);  
                second.add(amount);
            }
            
            if (part[0].equals("remove")) {                
                               
                int temp = second.contains() - amount;
                if (temp < 0) {                    
                    amount += temp;
                }
                second.remove(amount);
                first.add(amount);                
            }
            
            System.out.println("First: " + first);
            System.out.println("Second: " + second); 

        }
    }

}
