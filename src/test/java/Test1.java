/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.tripleseven.Chef;
import com.mycompany.tripleseven.Menu;
import com.mycompany.tripleseven.MenuItem;
import com.mycompany.tripleseven.Order;
import com.mycompany.tripleseven.Reservation;
import com.mycompany.tripleseven.ReservationSystem;
import com.mycompany.tripleseven.Restaurant;
import com.mycompany.tripleseven.Table;
import com.mycompany.tripleseven.Waiter;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hp
 */
public class Test1 {

    public Test1() {
    }

    Restaurant restaurant = new Restaurant();
    Menu menu = new Menu();

    ReservationSystem reservationSystem = new ReservationSystem();

    Date date = new Date();

    
    

    @Test
        void addItemsToMenu (){
            //add items to the menu
            menu.addItem (new MenuItem("Pizza", "Cheese and pepperoni", 10));
            menu.addItem (new MenuItem("Burguer", "150 grms, onions, cheese, and tomatoes", 15));
            menu.addItem (new MenuItem("HotDog", "Hot Dog with mustard and mayonaise", 5));
            
            assertEquals(3, menu.getAllItems().size());
        }
        
    
        @Test
        void addWaiters(){
            //Add Waiters
            restaurant.addWaiter(new Waiter(1, "Ali"));
            restaurant.addWaiter(new Waiter(2, "Yousef"));
            
            assertEquals(2, restaurant.getWaiters().size());
        }
        
        @Test
        void addChef() {
            restaurant.addChef(new Chef(1, "Mohammad"));
            
            assertEquals(1, restaurant.getChefs().size());
        }
        
        
        @Test
        void createOrders() {
            //Add Waiters
            restaurant.addWaiter(new Waiter(1, "Ali"));
            restaurant.addWaiter(new Waiter(2, "Yousef"));
            
            //create orders
            restaurant.placeOrder(new Order(1, restaurant.getWaiters().get(0)));
            restaurant.placeOrder(new Order(2, restaurant.getWaiters().get(1)));
            restaurant.placeOrder(new Order( 3, restaurant.getWaiters().get(0)));
            
            assertEquals(3, restaurant.getOrders().size());
        }
        
        @Test
        void addItemsToEachOrder () {
            //Add Waiters
            restaurant.addWaiter(new Waiter(1, "Ali"));
            restaurant.addWaiter(new Waiter(2, "Yousef"));
            
            //create orders
            restaurant.placeOrder(new Order(1, restaurant.getWaiters().get(0)));
            restaurant.placeOrder(new Order(2, restaurant.getWaiters().get(1)));
            restaurant.placeOrder(new Order( 3, restaurant.getWaiters().get(0)));
            
            //add items to each order
            restaurant.getOrders ().get(0).addItem(menu.getItemByName("Pizza"));
            restaurant.getOrders ().get(0).addSpecialRequest("Strawberry Juice.");
            
            restaurant.getOrders ().get(1).addItem(menu.getItemByName("Pizza"));
            restaurant.getOrders ().get(1).addItem(menu.getItemByName("Burguer"));
        
            restaurant.getOrders ().get(2).addItem(menu.getItemByName("Pizza"));
            restaurant.getOrders ().get(2).addItem(menu.getItemByName("Pizza"));
            restaurant.getOrders ().get(2).addItem(menu.getItemByName("HotDog"));
            
            assertEquals(1, restaurant.getOrders().get(0).getItems().size());
            assertEquals(2, restaurant.getOrders().get(1).getItems().size());
            assertEquals(3, restaurant.getOrders().get(2).getItems().size());
        }
        

        @Test
        void  addTables(){
            restaurant.addTable (new Table(1, "Big", "outdoor", true));
            restaurant.addTable (new Table(2, "Medium", "indoor", true));
            restaurant.addTable (new Table(2, "Small", "indoor", true));
            
            assertEquals(3, restaurant.getTables().size());
        }
    
        @Test
        void createReservations(){
            //Create Reservations
            Reservation reservation;
            reservation  = new Reservation(1, 1, 1, "andres", "+962781514210", LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30));
            reservationSystem.addReservation (reservation);
            restaurant.addCustomersRes (reservation);

            reservation  = new Reservation(2, 2, 2, "Juan", "+962781514310", LocalDateTime.of(20124, Month.MAY, 20, 8, 30));
            reservationSystem.addReservation (reservation);
            restaurant.addCustomersRes (reservation);
            
            assertEquals(2, reservationSystem.getReservations().size());
        }
    
}
