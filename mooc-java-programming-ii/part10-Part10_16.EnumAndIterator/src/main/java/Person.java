/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Person {
    private Education education;
    private String name;
    
    public Person(String name, Education education) {
        this.education = education;
        this.name = name;
    }
    
    public Education getEducation() {
        return this.education;
    }
    
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(name).append(", ").append(this.education);
        return output.toString();
    }
}
