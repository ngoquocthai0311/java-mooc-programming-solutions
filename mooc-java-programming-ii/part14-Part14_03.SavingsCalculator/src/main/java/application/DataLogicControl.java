/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.chart.XYChart;

/**
 *
 * @author ADMIN
 */
public class DataLogicControl {
    
    public XYChart.Series getMonthlySaving(double value) {
        
        XYChart.Series data = new XYChart.Series();
        for (int i = 0; i < 30; i++) {
            data.getData().add(new XYChart.Data(i, value * 12 * i));
        }
        return data;
    }
    
    public XYChart.Series getYearlySaving(double value, double interest) {
        XYChart.Series data = new XYChart.Series();
        data.getData().add(new XYChart.Data(0, 0));
        double monthlySaving = value * 12;        
        double interestRate = 1 + 1.0 * interest / 100;
        double afterOneYearSaving = monthlySaving * interestRate;
        for (int i = 1; i <= 30; i++) {            
            data.getData().add(new XYChart.Data(i, afterOneYearSaving));
            afterOneYearSaving = (afterOneYearSaving + monthlySaving) * interestRate;                        
        }
        return data;
    }             
}

