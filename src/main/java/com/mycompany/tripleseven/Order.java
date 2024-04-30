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
public class Order {
    private int orderID;
    private Waiter waiter;
    
    private ArrayList<MenuItem> items = new ArrayList<>();
    private ArrayList<String> specialRequest = new ArrayList<>();
    private float totalPrice;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
    
    

    public ArrayList<MenuItem> getItems() {
        return items;
    }
    
    

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    
    
    
    
    public void addItem(MenuItem item){
        items.add(item);
    }
    
    public void removeItem(MenuItem item){
        items.remove(item);
    }
    public void addSpecialRequest(String request){
        specialRequest.add(request);
    }
    public void removeSpecialRequest(String request){
        specialRequest.remove(request);
    }
    
    public String printItems (ArrayList<MenuItem> items) {
        String str_items = "";
        
        
        for (int i = 0 ; i < this.items.size() ; i++) {
            str_items = str_items + items.get(i).getItemName();
            if (i!=this.items.size()-1){
                str_items = str_items + ", ";
            } else {
                str_items = str_items + ".";
            }
        }
        
        return str_items;
    }
    
    public float calculateTotalAmount(ArrayList<MenuItem> items) {
        float x = 0;
        
        for (int i = 0 ; i < this.items.size() ; i++) {
            
            x = x + items.get(i).getItemPrice();
        }
        return x;}


    public Order(int orderID, Waiter waiter) {
        this.orderID = orderID;
        this.waiter = waiter;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order: " + orderID + "\n" + waiter.toString() + "\nItems: " + printItems(items) + "\nSpecial Request: " + specialRequest + "\nTotal Price: " + calculateTotalAmount(items) + "\n-------------\n";
    }
    
    
}
