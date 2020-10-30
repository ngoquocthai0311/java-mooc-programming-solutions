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
    private final static int END = -1;
    
    private Scanner scanner;
    private GradeList list;
    
    public UserInterface(Scanner scan, GradeList list) {
        this.list = list;
        this.scanner = scan;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(this.scanner.nextLine());
            
            if (input == END) {
                break;
            } 
            
            this.list.add(input);
        }
        
        System.out.println("Point average (all): " + this.list.getAverageAll());
        System.out.println("Point average (passing): " + this.list.getAveragePassing());
        System.out.println("Pass percentage: " + this.list.getPassPercentage());
        System.out.println("Grade distrubution: \n" + this.list.printGrades());
    }
}
