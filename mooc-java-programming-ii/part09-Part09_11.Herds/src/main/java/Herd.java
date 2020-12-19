
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Herd implements Movable{
    private ArrayList<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();        
    }
    
    public void addToHerd(Movable obj) {
        this.list.add(obj);
    }
    
    @Override
    public void move(int x, int y) {
        for (Movable each: this.list) {
            each.move(x, y);
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        for (Movable each: this.list) {
            output += each.toString() + "\n";
        }
        return output;
    }       
}
