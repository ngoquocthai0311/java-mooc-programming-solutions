/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Container {
    private final static int max = 100;    
    private int value;    
    
    public Container() {        
        this.value = 0;        
    }
    
    public int contains() {
        return this.value;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }          
        
        this.value += amount;
        if (this.value > max) {
            this.value = max;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.value -= amount;
        if (this.value < 0) {
            this.value = 0;
        }
    }
    
    public String toString() {
        return this.value + "/100";
    }
}
