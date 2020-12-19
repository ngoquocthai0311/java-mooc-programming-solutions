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
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storages;
    
    public StorageFacility() {
        this.storages = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storages.putIfAbsent(unit, new ArrayList<>());
        this.storages.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.storages.get(storageUnit) == null || this.storages.get(storageUnit).isEmpty()) {
            return new ArrayList<>();
        }
        return this.storages.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        this.storages.get(storageUnit).remove(item);
        if (this.storages.get(storageUnit).isEmpty()) {
            this.storages.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitNames = new ArrayList<>();
        for (String each: this.storages.keySet()) {
            unitNames.add(each);
        }
        return unitNames;
    }
}
