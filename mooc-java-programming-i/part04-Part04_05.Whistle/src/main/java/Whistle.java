/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Whistle {
    private String sound;
    
    // constructor
    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }
    
    public void sound(){
        System.out.println(this.sound);
    }
    
}
