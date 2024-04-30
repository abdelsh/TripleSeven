/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tripleseven;

/**
 *
 * @author hp
 */
public class DishFactory {

    public DishFactory() {
    }
    
    public static Dish createDish(String name){
        switch (name) {
            case "Pizza":
                return new Pizza();
            case "Burguer":
                return new Burguer();
            case "HotDog":
                return new HotDog();
            default:
            throw new IllegalArgumentException("Invalid Dish Type: " + name);
        }
    }
}
