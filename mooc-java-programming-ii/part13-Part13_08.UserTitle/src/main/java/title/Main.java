package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your title: ");
        String title = scanner.nextLine();
        
        Application.launch(UserTitle.class, "--Title=" +title);
        
    }

}