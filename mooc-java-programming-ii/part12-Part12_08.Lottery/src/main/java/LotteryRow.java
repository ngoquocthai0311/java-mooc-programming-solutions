
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private final static int LENGTH = 7;
    private final static int MAXNUM = 40;
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random rand = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randNum = rand.nextInt(MAXNUM) + 1;
            if (this.containsNumber(randNum)) {
                i--;
            } else {
                this.numbers.add(randNum);
            }                   
        }            
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers                
        return this.numbers.contains(number);
    }
}

