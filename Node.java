/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Record;

/**
 *
 * @author mahaa
 */
public class Node {
    
    int PhoneNo;
    String Name;
    DateAndTime Date;
    Node next;
    Events Event;
    int TicketNo;
    

    public Node() {
        this.PhoneNo = PhoneNo;
        this.Name = Name;
        this.Date = Date;
        this.Event = Event;
        this.next = next;
        this.TicketNo = TicketNo;
    }
    
    
     @Override
    
    public String toString(){
        if(next!=null)
        return "PhoneNo="+PhoneNo+" "+"Next="+next.PhoneNo;
        else return "PhoneNo="+PhoneNo;
    }
}