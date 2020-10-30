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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int max) {
        this.items = new ArrayList<>();    
        this.maxWeight = max;        
    }
    
    public void addItem(Item item) {
        int totalWeight = this.totalWeight() + item.getWeight();
        
        if (totalWeight > this.maxWeight) {
            return;
        }
        
        this.items.add(item);
    }
    
    public void printItems() {
        for (Item each: this.items) {
            System.out.println(each);
        }
    }            
    
    public String toString() { 
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        return this.items.size() + " " + ((this.items.size() == 1) ? "item" : "items") + " (" + this.totalWeight() + " kg)";
    }       
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item each: this.items) {
            totalWeight += each.getWeight();            
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {    
        if (this.items.isEmpty()) {
            return null;
        }
        Item heavy = this.items.get(0);
        for (Item each: this.items) {
            if (each.getWeight() > heavy.getWeight()) {
                heavy = each;
            }
        }
        return heavy;
    }
}
