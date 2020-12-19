/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class TemperatureSensor implements Sensor{
    private int value;
    private boolean status;

    public TemperatureSensor() {
        this.value = 0;
        this.status = false;
    }    
    
    @Override
    public boolean isOn() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.status;
    }

    @Override
    public void setOn() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int read() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (!(this.isOn())) {
            throw new IllegalStateException("The sensor is off");
        }
        
        Random random = new Random();
        int max = 30;
        int min = -30;
        value = random.nextInt((max - min) + 1) + min;
        return value;
    }
    
}
