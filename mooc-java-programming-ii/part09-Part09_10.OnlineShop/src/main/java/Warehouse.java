
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Warehouse {
    
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;
    
    public Warehouse() {
        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        return (this.products.get(product) != null) ? this.products.get(product) : -99 ;
    }
    
    public int stock(String product) {
        return (this.stocks.get(product) != null) ? this.stocks.get(product) : 0 ;
    }
    
    public boolean take(String product) {        
        if (this.stocks.get(product) == null) {
            return false;
        }
        int stock = this.stocks.get(product);
        if (stock == 0) {
            return false;
        }                
        this.stocks.put(product, stock - 1);
        return true;
    }
    
    public Set<String> products() {
        Set<String> set = new HashSet<>();
        for (String each: this.products.keySet()) {
            set.add(each);
        }
        return set;
    }
}
