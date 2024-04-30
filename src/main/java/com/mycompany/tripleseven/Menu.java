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
public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    
    public void addItem (MenuItem item) {
        items.add(item);
    }
    
    public void removeItem(MenuItem item) {
        items.remove(item);
    }
    
    public MenuItem getItemByName (String name) {
        MenuItem item = new MenuItem();
        
        for (int i = 0 ; i < items.size() ; i++){
            if(items.get(i).getItemName().equals(name)){
                item = items.get(i);
            }
        }
        return item;
    }
    
    public ArrayList<MenuItem> getAllItems(){return items;}

    public String getMenuItems(ArrayList<MenuItem> items) {
        String  menuItems = "";
        for (int i = 0 ; i < this.items.size() ; i++){
            menuItems = menuItems + items.get(i).toString();
            if (i!=this.items.size()-1){
                menuItems = menuItems + "";
            } else {
                menuItems = menuItems + "-----------";
            }
        }
        return menuItems;
    }
    
    @Override
    public String toString() {
        return "Menu:\n" + getMenuItems(items);
    }
    
}
