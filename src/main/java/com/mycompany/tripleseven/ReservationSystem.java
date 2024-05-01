/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripleseven;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class ReservationSystem {
    private List<Reservation> reservations = new ArrayList<>();
    
    

    public ReservationSystem() {
    }

    
    
    public void addReservation (Reservation reservation){
        reservations.add(reservation);
    }
    
    public void cancelReservation (Reservation reservation) {
        reservations.remove(reservation);
    }
    
    public List<Reservation> getReservations() {
        return reservations;
    }
    
    public Reservation getReservationByID (int resID){
        Reservation res = new Reservation();
        
        for (int i = 0 ; i < reservations.size() ; i++){
            if (reservations.get(i).getResID() == resID){
               
               res =  reservations.get(i);
            }
        }
        return res;
    }
    
    public ArrayList<Reservation> getReservationByDate(LocalDateTime date){
        ArrayList<Reservation> reservationsByDate = new ArrayList<>();
        
        for (int i = 0 ; i < reservations.size() ; i++){
            if (reservations.get(i).getDateTime() == date){
                
                reservationsByDate.add(reservations.get(i));
            }
        }
        return reservationsByDate;
    }

    @Override
    public String toString() {
        return "ReservationSystem{" + "reservations=" + reservations + '}';
    }
    
    
    
    
}

