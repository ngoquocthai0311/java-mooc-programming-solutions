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

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int max) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = max;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int preAddWeight= this.totalWeight() + suitcase.totalWeight();
        
        if (preAddWeight > this.maxWeight) {
            return;
        }
        
        this.suitcases.add(suitcase);
    }
    
    public int totalWeight() {
        int total = 0;
        for (Suitcase each: this.suitcases) {
            total += each.totalWeight();
        }
        return total;
    }
    
    public void printItems() {
        for (Suitcase each: this.suitcases) {
            each.printItems();
        }
    }
    
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        return this.suitcases.size() + " " + ((this.suitcases.size() == 1) ? "suitcase" : "suitcases") + " (" + this.totalWeight() + " kg)"; 
    }
}
