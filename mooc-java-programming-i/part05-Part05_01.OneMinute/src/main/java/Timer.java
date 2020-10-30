/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Timer {
    private ClockHand second;
    private ClockHand hundredths;
    
    public Timer() {
        this.second = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }
    
    public void advance() {
        this.hundredths.advance();
        
        if (this.hundredths.value() == 0) {
            this.second.advance();
        }
    }
    
    public String toString() {
        return this.second + ":" + this.hundredths;
    }
}
