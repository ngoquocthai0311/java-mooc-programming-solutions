/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> dict;
    
    public Abbreviations() {
        this.dict = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = this.sanitizedString(abbreviation);
        
        if (!(this.hasAbbreviation(abbreviation))) {
            this.dict.put(abbreviation, explanation);
        }
    }        
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.dict.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        if (this.hasAbbreviation(abbreviation)) {
            return this.dict.get(abbreviation);
        }
        return null;
    }
    
    private String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        
        string = string.toLowerCase();
        return string.trim();
    }
}
