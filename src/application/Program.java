/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;

/**
 *
 * @author Felipe
 */
public class Program {
    public static void main(String[] args) throws ParseException{
        
        Reservation reservation = new Reservation();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
        
        System.out.println("Room Number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy)");
        Date checkIn = sdf.parse(sc.next());
          System.out.println("Check-out date (dd/MM/yyyy)");
        Date checkOut = sdf.parse(sc.next());
        
       String error= reservation.updateDates(checkIn, checkOut);
       if (error != null){
           System.out.println("Error in reservation: " + error);
       }else{
           System.out.println("Reservation: "+ reservation);
       }
                
    }
    
}
