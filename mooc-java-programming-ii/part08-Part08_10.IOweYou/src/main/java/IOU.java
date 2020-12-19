/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> checkList;
    
    public IOU() {
        this.checkList = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.checkList.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.checkList.getOrDefault(toWhom, 0.0);
    }
}
