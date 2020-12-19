/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 * @param <T>
 */
public class Hideout<T> {

    private T object;
    
    public Hideout() {
        this.object = null;
    }        
    
    public void putIntoHideout(T toHide) {
        this.object = toHide;
    }
    
    public T takeFromHideout() {
        T temp = this.object;
        this.object = null;
        return temp;
    }
    
    public boolean isInHideout() {
        if (this.object != null) {
            return true;
        }        
        return false;
    }
}
