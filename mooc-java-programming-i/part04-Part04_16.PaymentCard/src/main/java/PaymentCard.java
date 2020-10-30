/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class PaymentCard {
    private double balance;
    
    // constructor 
    public PaymentCard(double initialBalance){
        this.balance = initialBalance;
    }
    
    // method
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }    
    
    public void eatAffordably() {
        // write code here        
        double temp = this.balance - 2.60;
        if (temp >= 0) {
            this.balance = temp;
        }
    }

    public void eatHeartily() {
        // write code here
        double temp = this.balance - 4.60;
        if (temp >= 0) {
            this.balance = temp;
        }
    }
    
    public void addMoney(double amount) {
        // write code here
        // if amount is negative the function return void;
        if (amount < 0) {
            return;
        }
       
        double temp = this.balance + amount;
        if (temp > 150) {
            this.balance = 150.0;
        } else {
            this.balance = temp;
        }
            
    }
}
