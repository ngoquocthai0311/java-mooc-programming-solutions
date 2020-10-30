/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class TextUI {
    private final static String ADDCOMMAND = "add";
    private final static String SEARCHCOMMAND = "search";
    
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scan, SimpleDictionary list) {
        this.scanner = scan;
        this.dict = list;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals(ADDCOMMAND)) {
                System.out.print("Command: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                
                this.dict.add(word, translation);               
            }
            
            if (command.equals(SEARCHCOMMAND)) {
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();                              
                                
                String translation = this.dict.translate(word); 
                if (translation != null) {
                    System.out.println("Translation: " + translation);  
                } else {
                    System.out.println("Word " + word + " was not found");
                }                            
            }
            
            System.out.println("Unknow command");
        }        
    }
}
