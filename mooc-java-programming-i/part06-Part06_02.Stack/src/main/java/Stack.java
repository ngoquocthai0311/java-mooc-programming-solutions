/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
public class Stack {
    private ArrayList<String> list;
    
    // constructor 
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take() {
        String value = this.list.get(this.list.size() - 1);
        // remove the value of taking it out
        this.list.remove(this.list.size() - 1);
        return value;
    }
}
