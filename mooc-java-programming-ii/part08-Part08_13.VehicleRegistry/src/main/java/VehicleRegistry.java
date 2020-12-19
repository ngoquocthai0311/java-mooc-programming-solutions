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

public class VehicleRegistry {
    private HashMap<LicensePlate, String> list;
    
    public VehicleRegistry() {
        this.list = new HashMap<>();
    }
    
    public VehicleRegistry(HashMap<LicensePlate, String> object) {
        this.list = object;
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate each: this.list.keySet()) {
            if (each.equals(licensePlate)) {              
                return false;
            }
        }       
        this.list.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        for (LicensePlate each: this.list.keySet()) {
            if (each.equals(licensePlate)) {
                return this.list.get(licensePlate);
            }
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.list.remove(licensePlate) != null) {
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate each: this.list.keySet()) {
            System.out.println(each);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        
        for (LicensePlate each: this.list.keySet()) {
            if (!(owners.contains(this.list.get(each)))) {
                System.out.println(this.list.get(each));
                owners.add(this.list.get(each));
            }
         }              
    }
}
