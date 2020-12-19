/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Book {
    private String name;
    private int recommendedYear;

    public Book(String name, int recommendedYear) {
        this.name = name;
        this.recommendedYear = recommendedYear;
    }
    
    @Override
    public String toString() {
        return this.name + " (recommended for " + this.recommendedYear + " year-olds or older)";
    }

    public String getName() {
        return name;
    }

    public int getRecommendedYear() {
        return recommendedYear;
    }     
}
