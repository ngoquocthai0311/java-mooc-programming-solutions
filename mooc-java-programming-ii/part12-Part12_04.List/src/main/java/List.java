
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class List<T> {
    private final static int INITLENGTH = 10;
    private T[] list;
    private int currentIndex;

    public List() {
        this.currentIndex = 0;
        this.list = (T[]) new Object[INITLENGTH];
    }        
    
    public void add(T value) {        
        if (this.currentIndex == this.list.length) {    
            this.grow();
        }
        
        this.list[currentIndex] = value;
        this.currentIndex++;    
    }        
    
    public boolean contains(T value) {
        return this.indexOfValue(value) >= 0;
    }    
    
    public void remove(T value) {
        int indexOfValue = this.indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }
        moveToLeft(indexOfValue);
        this.currentIndex--;
    }
    
    public T value(int index) {
        if (index < 0 || index >= this.list.length) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.currentIndex + "]");
        }
        return this.list[index];
    }
    
    public int indexOfValue(T value) {
        for (int i = 0; i < this.currentIndex; i++) {
            if (this.list[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    public int size() {
        return this.currentIndex;
    }
    /* All private methods */
    
    private void grow() {
        // create new length;
        int newLength = this.list.length + this.list.length / 2;
            
        // creating new array with new length 
        T[] newList = (T[]) new Object[newLength];
            
        // iterate the old array and copy to new array
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        this.list = newList;
    }
       
    private void moveToLeft(int fromIndex) {
        for (int i = fromIndex; i < this.currentIndex - 1; i++) {
            this.list[i] = this.list[i + 1] ;
        }
    }
}
