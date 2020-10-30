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

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();       
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = this.persons.get(0);
        for (Person person: this.persons) {           
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person output = this.shortest();
        // delete the shortest person;
        this.persons.remove(output);
        return output;
    }
}   
