

public class Checker {
    
    public boolean isDayOfWeek(String string) {
        String regx = "mon|tue|wed|thu|fri|sat|sun";
        return string.toLowerCase().matches(regx);  
    }   
    
    public boolean allVowels(String string) {
        String regx = "(u|e|o|a|i)*";       
        return string.toLowerCase().matches(regx);
    }
    
    public boolean timeOfDay(String string) {
        String regx = "([0-2][0-3]|(0|1)[0-9]):[0-5][0-9]:[0-5][0-9]";        
        return string.toLowerCase().matches(regx);
    }
    
}
