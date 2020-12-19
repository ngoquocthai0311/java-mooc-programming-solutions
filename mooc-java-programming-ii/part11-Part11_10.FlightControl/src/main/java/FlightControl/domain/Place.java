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
public class Place {
    private String name;
    
    public Place(String name) {
        this.name = name;
    }           
    
    @Override
    public String toString() {
        return this.name;
    }
}
