/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class CD implements Packable{
    
    private static final double WEIGHT = 0.1;
    
    private String artist;
    private String name;
    private int publicationYear;    
    
    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = year;                 
    }
    
    @Override
    public double weight() {
        return WEIGHT;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publicationYear + ")";
    }
}
