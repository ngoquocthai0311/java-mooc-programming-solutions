
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> list;
    
    public Hand() {
        this.list = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.list.add(card);
    }
    
    public void print() {
        this.list.stream().forEach(each -> System.out.println(each));
    }            
    
    public void sort() {
        Comparator<Card> comparator = Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
        Collections.sort(list, comparator);       
    }
    
    public int sum() {
        return this.list.stream().map(each -> each.getValue()).reduce(0, (previousSum, value) -> previousSum + value);
    }            

    @Override
    public int compareTo(Hand compared) {               
        return this.sum() - compared.sum();
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);
        Collections.sort(list, comparator);
    }
}
