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

public class MisplacingBox extends Box{
    
    private ArrayList<Item> hole;
    
    public MisplacingBox() {
        this.hole = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        this.hole.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
