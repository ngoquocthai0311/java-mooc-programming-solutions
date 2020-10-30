
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int wins = 0;
        int losses = 0;
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try (Scanner pointer = new Scanner(Paths.get(file))) {
            while (pointer.hasNextLine()) {                          
                String[] gameInfo = pointer.nextLine().split(",");
                
                for (int i = 0; i <= 1; i++) {
                    if (gameInfo[i].equals(team)){
                        count++;                    
                        if (i == 0) {
                            if (Integer.valueOf(gameInfo[i + 2]) < Integer.valueOf(gameInfo[i + 3])) {
                                losses++;
                            } else {
                                wins++;
                            }                            
                        } else {
                            if (Integer.valueOf(gameInfo[i + 1]) < Integer.valueOf(gameInfo[i + 2])) {
                                wins++;
                            } else {
                                losses++;
                            }     
                        }                       
                    }           
                }                                                  
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
