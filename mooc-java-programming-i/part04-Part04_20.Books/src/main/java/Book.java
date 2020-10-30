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
    private String title;
    private int pages;
    private int publicYear;
    
    // constructor 
    public Book(String initialTitle, int initialPages, int initialPublicYear) {
        this.title = initialTitle;
        this.pages = initialPages;
        this.publicYear = initialPublicYear;       
    }
    
    // method 
    public String getTitle() {
        return this.title;
    }
    
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.publicYear;
    }
}
