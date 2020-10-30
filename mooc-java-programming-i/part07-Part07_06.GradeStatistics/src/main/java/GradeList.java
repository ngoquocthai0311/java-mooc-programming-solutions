/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;

public class GradeList {
    private ArrayList<Integer> list;
    
    public GradeList() {
        this.list = new ArrayList<>();
    }
    
    public void add(int num) {
        if (num >= 0 && num <= 100) {
            this.list.add(num);
        }
    }
    
    private String getAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (Integer each: grades) {
            sum += each;
        }
        
        if (sum == 0) {
            return "-";
        } 
        return String.valueOf(1.0 * sum / grades.size());
    }
    
    public ArrayList<Integer> passingList() {
        ArrayList<Integer> passing = new ArrayList<>();
        for (Integer each: this.list) {
            if (each >= 50) {
                passing.add(each);
            } 
        }
        return passing;
    }
    
    public String getAverageAll() {
        return this.getAverage(this.list);
    }       
    
    public String getAveragePassing() {
        return this.getAverage(this.passingList());
    }       
    
    public String getPassPercentage() {
        return String.valueOf(1.0 * 100 * this.passingList().size() / this.list.size());
    }
    
    public String printGrades() {
        String output = "";
        int[] grade = {0,0,0,0,0,0};
        
        for (Integer each: this.list) {
            if (each < 50) {
                grade[0]++;
                continue;
            }
            if (each < 60) {
                grade[1]++;
                continue;
            }
            if (each < 70) {
                grade[2]++;
                continue;
            }
            if (each < 80) {
                grade[3]++;
                continue;
            }
            if (each < 90) {
                grade[4]++;
                continue;
            }
            if (each >= 90) {
                grade[5]++;
                continue;
            }                
        }
        
        for (int i = grade.length - 1; i >= 0; i--) {
            output += i + ": ";
            for (int j = 0; j < grade[i]; j++) {
                output += "*";
            }
            output += "\n";
        }
        return output;
    }
}
