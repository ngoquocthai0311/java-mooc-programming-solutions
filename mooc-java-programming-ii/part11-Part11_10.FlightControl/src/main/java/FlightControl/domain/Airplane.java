/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author ADMIN
 */
public class Airplane {
    private String ID;
    private int capacity;

    public Airplane(String ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getID() {
        return ID;
    }        
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ID).append(" (").append(this.capacity).append(" capacity)");
        return builder.toString();
    }
}
