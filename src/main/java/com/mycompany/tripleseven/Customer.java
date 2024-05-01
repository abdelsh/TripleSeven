/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripleseven;

/**
 *
 * @author hp
 */
public class Customer extends Human implements Payment {
    private String phoneNumber;
    
    
    private Restaurant restaurant = new Restaurant();

    public Customer(int id, String name, String phoneNumber) {
        super(id, name);
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public float getAmount() {
        float amountToPay = 0;
        for (int i = 0 ; i < restaurant.getOrders().size() ; i++){
            if (restaurant.getOrders().get(i).getOrderID() == getId()){
                amountToPay =restaurant.getOrders().get(i).calculateTotalAmount(restaurant.getOrders().get(i).getItems());
            }
        }
        return amountToPay;
    }

    @Override
    public String getPaymentMethod() {
        return "introduce a valid payment method";
    }

    @Override
    public void printVoucher() {
        for (int i = 0 ; i < restaurant.getOrders().size() ; i++){
            if (restaurant.getOrders().get(i).getOrderID() == getId()){
                System.out.println(restaurant.getOrders().get(i));
            }
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer:\nID: " + super.getId() + "\nName: " + super.getName() + "\nPhone Number: " + phoneNumber + "\n--------";
    }
    
    
}
