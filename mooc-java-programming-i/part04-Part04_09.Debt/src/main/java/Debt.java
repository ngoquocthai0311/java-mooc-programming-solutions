/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Debt {
    private double balance;
    private double interestRate;
    
    // constructor
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    // method 
    public void printBalance(){
        System.out.println(this.balance);
    }
    
    public void waitOneYear(){
        this.balance *= this.interestRate;
    }
}
