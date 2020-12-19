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

public class Box implements Packable{
    
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (item.weight() + this.weight() <= this.capacity) {
            this.items.add(item);
        }
    }         
    
    @Override
    public double weight() {
        double sum = 0;
        for (Packable item: this.items) {
            sum += item.weight();
        }
        return sum;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
