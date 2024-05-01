/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tripleseven;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author hp
 */
public class TripleSeven {

    public static void main(String[] args) {
        
        
        Restaurant restaurant = new Restaurant();
        Menu menu = new Menu();
        
        ReservationSystem reservationSystem = new ReservationSystem();
        
        Date date = new Date();
        
        
        //add items to the menu
        menu.addItem(new MenuItem("Pizza", "Cheese and pepperoni", 10));
        menu.addItem(new MenuItem("Burguer", "150 grms, onions, cheese, and tomatoes", 15));
        menu.addItem(new MenuItem("HotDog", "Hot Dog with mustard and mayonaise", 5));
        
        System.out.println(menu.toString()); //print the menu
        
        //Add Waiters
        restaurant.addWaiter(new Waiter(1, "Ali"));
        restaurant.addWaiter(new Waiter(2, "Yousef"));
        
        //Add Chefs
        restaurant.addChef(new Chef(1, "Mohammad"));
        
        //Add Observer to the Chef
        restaurant.getChefs().get(0).addObserver(restaurant.getWaiters().get(0));
        restaurant.getChefs().get(0).addObserver(restaurant.getWaiters().get(1));
        
        //create orders
        restaurant.placeOrder(new Order(1, restaurant.getWaiters().get(0)));
        restaurant.placeOrder(new Order(2, restaurant.getWaiters().get(1)));
        restaurant.placeOrder(new Order( 3, restaurant.getWaiters().get(0)));
        
        //add items to each order
        restaurant.getOrders().get(0).addItem(menu.getItemByName("Pizza"));
        restaurant.getOrders().get(0).addSpecialRequest("Strawberry Juice.");
        
        restaurant.getOrders().get(1).addItem(menu.getItemByName("Pizza"));
        restaurant.getOrders().get(1).addItem(menu.getItemByName("Burguer"));
        
        restaurant.getOrders().get(2).addItem(menu.getItemByName("Pizza"));
        restaurant.getOrders().get(2).addItem(menu.getItemByName("Pizza"));
        restaurant.getOrders().get(2).addItem(menu.getItemByName("HotDog"));
        
        //print each order
        for (int i = 0 ; i < restaurant.getOrders().size() ; i++) {
            System.out.println(restaurant.getOrders().get(i));
        }
        
        //add Tables
        restaurant.addTable(new Table(1, "Big", "outdoor", true));
        restaurant.addTable(new Table(2, "Medium", "indoor", true));
        restaurant.addTable(new Table(2, "Small", "indoor", true));
        
        //Create Reservations
        Reservation reservation;
        reservation = new Reservation(1, 1, 1, "andres", "+962781514210", LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30));
        reservationSystem.addReservation(reservation);
        restaurant.addCustomersRes(reservation);
        
        reservation = new Reservation(2, 2, 2, "Juan", "+962781514310", LocalDateTime.of(20124, Month.MAY, 20, 8, 30));
        reservationSystem.addReservation(reservation);
        restaurant.addCustomersRes(reservation);
        
        for (int i = 0 ; i < reservationSystem.getReservations().size() ; i++) {
            System.out.println(reservationSystem.getReservations().get(i));
        }
        
        
        
        
        for (int i = 0 ; i < restaurant.getCustomers().size() ; i++) {
            System.out.println(restaurant.getCustomers().get(i));
        }
        
        
        //prepare orders
        for (int i = 0 ; i < restaurant.getOrders().size() ; i++) {
            restaurant.getChefs().get(0).prepareOrder(restaurant.getOrders().get(i));
        }
        
    }
}
