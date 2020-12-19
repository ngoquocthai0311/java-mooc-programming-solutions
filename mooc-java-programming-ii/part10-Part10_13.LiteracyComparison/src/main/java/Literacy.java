/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Literacy implements Comparable<Literacy>{
    private String name;
    private int year;
    private String gender;
    private double literacyPercent;

    public Literacy(String name, int year, String gender, double literacyPercent) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.literacyPercent = literacyPercent;
    }

    @Override
    public int compareTo(Literacy compared) {
        double result = this.literacyPercent - compared.literacyPercent;
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        }        
        return 0;      
    }
    
    public void print() {
        
    }
    
    @Override
    public String toString() {
        return this.name +" (" + this.year + "), " + this.gender + ", " + this.literacyPercent;
    }
}
