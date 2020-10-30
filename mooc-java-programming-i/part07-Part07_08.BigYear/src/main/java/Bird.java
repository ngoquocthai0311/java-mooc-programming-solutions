/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Bird {

    private String name;
    private String nameInLatin;
    private int count;

    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.count = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNameInLatin() {
        return this.nameInLatin;
    }

    public int getCount() {
        return this.count;
    }

    public void observations() {
        this.count++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.nameInLatin + "): " + this.count + " observations";
    }

}
