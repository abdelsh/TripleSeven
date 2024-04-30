/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripleseven;

/**
 *
 * @author hp
 */
public class Waiter extends Human implements OrderObserver{

    public Waiter(int id, String name) {
        super(id, name);
    }
    
    
    

    @Override
    public void update(Order order) {
        // Notify waiter about the new order
        System.out.println("Waiter Name: " + order.getWaiter().getName() + " received a new order: " + order.getOrderID());
    }

    @Override
    public String toString() {
        return "Waiter: Name: " + super.getName() + " ID: " + super.getId();
    }
    
    
}
