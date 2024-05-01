/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripleseven;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Restaurant {
    private Menu menu;
    private ReservationSystem reservationSystem = new ReservationSystem(); 
    
    private ArrayList<Table> tables = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    
    //add humans
    private ArrayList<Waiter> waiters = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Chef> chefs = new ArrayList<>();
    
    
    //getters
    public ArrayList<Table> getTables() {return tables;}
    public ArrayList<Order> getOrders() {return orders;}
    public ArrayList<Waiter> getWaiters() {return waiters;}
    public ArrayList<Chef> getChefs() {return chefs;}
    public ArrayList<Customer> getCustomers() {return customers;}
    

    //add
    public void addWaiter (Waiter waiter){ waiters.add(waiter);}
    public void addCustomer (Customer customer) {customers.add(customer);}
    public void addChef (Chef chef){chefs.add(chef);}
    public void addTable (Table table) {tables.add(table);}
    public void placeOrder (Order order) {orders.add(order);}

    public void addCustomersRes(Reservation reservation){
        Table table = new Table();
         for (int i = 0 ; i < tables.size() ; i++){
            if (reservation.getTableID() == tables.get(i).getTableID()){
                reservation.setTable(tables.get(i));
            }
        }
        customers.add(reservation.getCustomer());
    }
    

    public Table getTableById(int ID){
        Table table = new Table();
        
        for (int i = 0 ; i < tables.size() ; i++) {
            if (tables.get(i).getTableID() == ID){
            table = tables.get(i);
            }
        }
        return table;
    }
    
    public ArrayList<Table> getAvailableTables () {
        ArrayList<Table> availableTables = new ArrayList<>();
        
        for (int i = 0 ; i < tables.size() ; i++) {
            if (tables.get(i).isStatus()){
            availableTables.add(tables.get(i));
            }
        }
        return availableTables;
    }
    
    public Table getTableByTypeAndLocation (String type, String location){
        Table table = new Table();
        
        for (int i = 0 ; i < tables.size() ; i++) {
            if (tables.get(i).getType().equals(type) && tables.get(i).getLocation().equals(location)){
            table = tables.get(i);
            }
        }
        return table;
    }
    
}
