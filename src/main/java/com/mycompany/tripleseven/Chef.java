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
public class Chef extends Human implements OrderObservable, Payment{
    private ArrayList<OrderObserver> observers = new ArrayList<>();

    public Chef(int id, String name) {
        super(id, name);
    }

    public Chef() {
    }
    
    public void prepareOrder(Order order) {
        for (int i = 0 ; i < order.getItems().size() ; i++){
           Dish dish = new DishFactory().createDish(order.getItems().get(i).getItemName());
           dish.prepare();
           
        }
        notifyObservers(order);
        // Prepare the order
        System.out.println("Chef has prepared the order: " + order.getOrderID() + "\n\n----------");
    }

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Order order) {
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }

    
    @Override
    public float getAmount() {
        int workingHours = 40;
        float salaryPerHour = 15;
        return workingHours*salaryPerHour;
    }

    @Override
    public String getPaymentMethod() {
        return "Waiter prefers to get the payment though bank transfer";
    }

    @Override
    public void printVoucher() {
        System.out.println("The chef " + getName() + " got paid " + getAmount());
    }
    
    
    
    

}
