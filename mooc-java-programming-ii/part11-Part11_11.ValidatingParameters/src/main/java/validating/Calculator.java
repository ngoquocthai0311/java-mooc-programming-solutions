package validating;

public class Calculator {
    
    private final static String REGXNUM = "^([0-9]|[1-9][0-9]*)$"; // 0 - N || not allow the 0 at the beginning .
       
    public int factorial(int num) {        
        if (!(String.valueOf(num).matches(REGXNUM))) {
            throw new IllegalArgumentException("number is invalid");
        }
        
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (!(String.valueOf(setSize).matches(REGXNUM)) || !(String.valueOf(subsetSize).matches(REGXNUM)) || subsetSize > setSize) {
            throw new IllegalArgumentException("invalid setSize or subsetSize");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
