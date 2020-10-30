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

public class UserInterface {
    private final static String ADDCOMMAND = "add";
    private final static String STOPCOMMAND = "stop";
    private final static String LISTCOMMAND = "list";
    private final static String REMOVECOMMAND = "remove";
    
    private TodoList toDoList;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.toDoList = list;
        this.scanner = scan;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals(STOPCOMMAND)) {
                break;
            }
                        
            if (command.equals(ADDCOMMAND)) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                
                this.toDoList.add(task);
            }                        
            
            if (command.equals(LISTCOMMAND)) {
                this.toDoList.print();
            }
            
            if (command.equals(REMOVECOMMAND)) {
                System.out.print("Which one is removed?");
                int index = Integer.valueOf(this.scanner.nextLine());
                
                this.toDoList.remove(index);
            }
        }
    }
}
