
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        
        for (int i = 0; i < usernames.length && i < passwords.length; i++) {
            if (user.equals(usernames[i]) && pass.equals(passwords[i])) {
                System.out.println("You have successfully logged in!");
                return; // exit the program 
            }
        }
        System.out.println("Incorrect username or password!");
    }
}
