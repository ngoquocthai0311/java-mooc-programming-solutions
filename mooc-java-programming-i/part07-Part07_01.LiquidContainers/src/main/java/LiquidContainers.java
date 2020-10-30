
import java.util.Scanner;

public class LiquidContainers {
    // gobal variables    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        int first = 0;
        int second = 0;
        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String part[] = input.split(" ");
            
            if (part[0].equals("add")) {                                                          
                int value = Integer.valueOf(part[1]);
                if (value >= 0) {
                    first += value;
                    if (first > 100) {
                        first = 100;
                    }
                }                                     
            } 
            
            if (part[0].equals("move")) {
                int moveValue = Integer.valueOf(part[1]);
                int temp = first - moveValue;
                if (temp < 0) {
                    first = 0;
                    moveValue += temp;
                } else {
                    first -= moveValue;
                }
                
                second += moveValue;
                if (second > 100) {
                    second = 100;
                }                      
            }
            
            if (part[0].equals("remove")) {
                int moveValue = Integer.valueOf(part[1]);
                int temp = second - moveValue;
                if (temp < 0) {
                    second = 0;
                    moveValue += temp;
                } else {
                    second -= moveValue;
                }
                
                first += moveValue;
                if (first > 100) {
                    first = 100;
                }  
            }
            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");                        
                        
        }        
    }    
}
