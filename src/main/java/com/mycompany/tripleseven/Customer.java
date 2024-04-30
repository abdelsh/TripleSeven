/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripleseven;

/**
 *
 * @author hp
 */
public class Customer extends Human {
    private String phoneNumber;

    public Customer(int id, String name, String phoneNumber) {
        super(id, name);
        this.phoneNumber = phoneNumber;
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
