/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripleseven;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Reservation {
    private int resID, tableID, customerID;
    private String resCustomerName, resCustomerPhoneNumber;
    private LocalDateTime dateTime;
    private Table table;
    
    
    private Customer customer;

    public Reservation(int resID, int tableID, int customerID, String resCustomerName, String resCustomerPhoneNumber, LocalDateTime dateTime) {
        this.resID = resID;
        this.tableID = tableID;
        this.customerID = customerID;
        this.resCustomerName = resCustomerName;
        this.resCustomerPhoneNumber = resCustomerPhoneNumber;
        this.dateTime = dateTime;
        
        customer = new Customer(customerID, resCustomerName, resCustomerPhoneNumber);
    }

    public Reservation() {
    }

    public Customer getCustomer() {
        return customer;
    }

    

    

    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public int getTableID() {
        return tableID;
    }
    
    

    public String getResCustomerName() {
        return resCustomerName;
    }

    public void setResCustomerName(String resCustomerName) {
        this.resCustomerName = resCustomerName;
    }

    public String getResCustomerPhoneNumber() {
        return resCustomerPhoneNumber;
    }

    public void setResCustomerPhoneNumber(String resCustomerPhoneNumber) {
        this.resCustomerPhoneNumber = resCustomerPhoneNumber;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Reservation: " + resID + "\nCustomer Name: " + resCustomerName + "\nCustomer PhoneNumber: " + resCustomerPhoneNumber + "\nDate:" + dateTime + "\nTable:" + table + "\n---------";
    }
    
    
}
