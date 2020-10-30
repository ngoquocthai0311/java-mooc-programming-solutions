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

public class MessagingService {
    private ArrayList<Message> list;
    
    public MessagingService() {
        this.list = new ArrayList<>();
    }
    
    public void add(Message mess){
        if (!(this.list.contains(mess)) && mess.getContent().length() <= 280) {
            this.list.add(mess);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.list;
    }
}
