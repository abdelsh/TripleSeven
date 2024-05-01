/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripleseven;

/**
 *
 * @author hp
 */
public class Waiter extends Human implements OrderObserver, Payment{

    public Waiter(int id, String name) {
        super(id, name);
    }
    
    @Override
    public void update(Order order) {
        // Notify waiter about the new order
        System.out.println("Waiter Name: " + order.getWaiter().getName() + " received a new order: " + order.getOrderID());
    }
    
    @Override
    public float getAmount() {
        int workingHours = 40;
        float salaryPerHour = 10;
        return workingHours*salaryPerHour;
    }

    @Override
    public String getPaymentMethod() {
        return "Waiter prefers to get the payment in cash";
    }

    @Override
    public void printVoucher() {
        System.out.println("The waiter " + getName() + " got paid " + getAmount());
    }
    
    

    @Override
    public String toString() {
        return "Waiter: Name: " + getName() + " ID: " + getId();
    }

    
    
    
}
