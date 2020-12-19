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

public class ChangeHistory {
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changes.add(status);
    }
    
    public void clear() {
        this.changes.clear();
    }
    
    public double maxValue() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        
        double max = this.changes.get(0);
        for (int i = 1; i < this.changes.size(); i++) {
            if (max < this.changes.get(i)) {
                max = this.changes.get(i);
            }
        }
        return max;
    }
    
    public double minValue() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        
        double min = this.changes.get(0);
        for (int i = 1; i < this.changes.size(); i++) {
            if (min > this.changes.get(i)) {
                min = this.changes.get(i);
            }
        }
        return min;
    }
    
    public double average() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        for (Double each: this.changes) {
            sum += each;
        }    
        
        return sum / this.changes.size();
    }
    
    @Override
    public String toString() {
        return this.changes.toString();
    }        
}
