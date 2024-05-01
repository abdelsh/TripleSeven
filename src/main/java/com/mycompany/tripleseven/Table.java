/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripleseven;

/**
 *
 * @author hp
 */
public class Table {
    private int tableID;
    private String type; //big or small or medium
    private String location; //Outdoor or indoor
    private boolean status; // Available or not

    public Table(int tableID, String type, String location, boolean status) {
        this.tableID = tableID;
        this.type = type;
        this.location = location;
        this.status = status;
    }

    public Table() {
    }

    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

    @Override
    public String toString() {
        String available = (status)? "Available" : "Not available";
        return "Table ID: " + tableID + "\ntype: " + type + "\nLocation: " + location + "\nStatus: " + available + "\n-----------";
    }
    
    
    
}
