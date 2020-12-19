/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class SaveableDictionary {
    private HashMap<String, String> dict;   
    private String file;
    
    public SaveableDictionary() {
        this.dict = new HashMap<>();
    }
    public SaveableDictionary(String file){
        this.dict = new HashMap<>();      
        this.file = file;
    }   
    
    public boolean load(){
        try {
            Files.lines(Paths.get(this.file)).map(each -> each.split(":")).forEach(parts -> this.dict.put(parts[0], parts[1]));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }        
    }
    
    public void add(String words, String translation) {
//        if (this.dict.containsKey(words)) {
//            return;
//        }
        this.dict.putIfAbsent(words, translation);
    }
    
    public String translate(String word) {
        String translation = this.dict.get(word);           
        if (translation == null) {
            for (String each: this.dict.keySet()) {
                if (this.dict.get(each).equals(word)) {
                    translation = each;                  
                    break;
                }
            }            
        } 
        return translation;
    }
    
    public void delete(String word) {
        if (this.dict.remove(word) == null) {
            this.dict.values().removeIf(each -> each.equals(word));
        }
    }
    
    public boolean save() {      
        try {
            PrintWriter writer = new PrintWriter(this.file);
            this.dict.keySet().stream().forEach(line -> writer.println(line + ":" + this.dict.get(line)));
            writer.close();
            return true;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }                
    }
}
