/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Record;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mahaa
 */
public class Events {
       Scanner get = new Scanner(System.in);
    
    static HashMap<String, Double> Events = new <String, Double>HashMap(); //declares the name of the flower and the price
    static {
        Events.put("BLVD RUH CITY", 50.0);
        Events.put("WINTER WONDERLAND", 79.0);
        Events.put("WWE CROWN JEWEL", 253.0);
        Events.put("SUWAIDI PARK", 0.0);
        Events.put("RUH ZOO", 10.0);
    }
    public Events(){
         
    }
    public double totalPrice;
    String S ;


    public String cheek(String s) { 
        
        while (!((s.equalsIgnoreCase("A")) || (s.equalsIgnoreCase("B") || s.equalsIgnoreCase("C"))|| s.equalsIgnoreCase("D")|| s.equalsIgnoreCase("E"))) {
            try {
                throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.err.println("ans. A,B,C,D or E\nplease answer again");
                s = get.next();
                continue;
            }
        }
        return s;
    }
    
    public void BookAnEvent() {
       String t="";
       System.out.println("choose the event you want to book");
       System.out.println("      A\t               B\t                 C\t               D\t         E\t ");
       do{
       
          System.out.println(Events + "\n");
              S =get.next();
           if (cheek(S).equalsIgnoreCase("a")) 
            totalPrice += Events.get("BLVD RUH CITY");
           if (cheek(S).equalsIgnoreCase("b")) 
            totalPrice += Events.get("WINTER WONDERLAND");
             if (cheek(S).equalsIgnoreCase("c")) 
            totalPrice += Events.get("SUWAIDI PARK");
             if (cheek(S).equalsIgnoreCase("d")) 
            totalPrice += Events.get("RUH ZOO");
             if (cheek(S).equalsIgnoreCase("e")) 
            totalPrice += Events.get("WWE CROWN JEWEL");
          System.out.println("Do you want another book ?");
              t = get.next();
       }while(true==t.equalsIgnoreCase("yes"));
            
         // GetPrice(totalPrice);
        }
       
//       public double GetPrice( double totalPrice){
//           return totalPrice;
//           
//       } 
    
    public String toString(){
       return ""+totalPrice;
    }
}
