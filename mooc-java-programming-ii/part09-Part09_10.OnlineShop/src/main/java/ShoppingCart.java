
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    
    public void add(String product, int price) {   
        Item item = new Item(product, 1, price);
        if (!(this.items.contains(item))) {
            this.items.add(new Item(product, 1, price));
            return;
        }
        for (Item each: this.items) {
            if (each.equals(item)) {
                each.increaseQuantity();
            }
        }
    }
    
    public int price() {
        if (this.items.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Item each: this.items) {
            if (each.price() < 0) {
                continue;
            }
            sum += each.price();            
        }               
        return sum;
    }      
    
    public void print() {
        for (Item item: this.items) {
            System.out.println(item);
        }        
    }
}
