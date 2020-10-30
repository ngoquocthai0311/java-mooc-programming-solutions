/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Song {
    private String name;
    private int length;
    
    // constructor 
    public Song(String initialName, int initialLength){
        this.name = initialName;
        this.length = initialLength;
    }         
    
    // method 
    public String name(){
        return this.name;
    }
    public int length(){
        return this.length;
    }
}