/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tripleseven;

/**
 *
 * @author hp
 */
public interface OrderObservable {
    public void addObserver(OrderObserver orderObserver);
    public void removeObserver(OrderObserver orderObserver);
    public void notifyObservers(Order order);
    
    
}
