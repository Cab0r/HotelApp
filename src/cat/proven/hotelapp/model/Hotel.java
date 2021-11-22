package cat.proven.hotelapp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mario Barroso
 */
public class Hotel {
    private Map<Room, List<Customer>> hotel;
    

    
    
    public void llenar() throws NegativeException {
        
        hotel.put(new Room(1,4,50), new ArrayList<>());
        
        ArrayList<Customer> c = new ArrayList<>();
        c.add(new Customer("Michi","zzz"));
        c.add(new Customer("Doraemon","ddd"));
        hotel.put(new Room(2,3,150), c);
        
    }
    
    
    
    
    public Hotel(){
        hotel= new HashMap<>();
    }
    
    /**
     * Search all the rooms in the Hotel
     * @return ArrayList with all the rooms
     */
    public List<Room> AllRooms(){
        List<Room> allRooms = new ArrayList<>();
        Set<Room> rooms= hotel.keySet();
        rooms.forEach((Room k)->{
            allRooms.add(k);
        });
        return allRooms;
    }
    
    /**
     * Search all the Customers in the Hotel
     * @return ArrayList with all the rooms
     */
    public List<Customer> AllCustomers(){
        List<Customer> allCustomers = new ArrayList<>();
        Set<Room> rooms= hotel.keySet();
        rooms.forEach((Room k)->{
            hotel.get(k).forEach((Customer c) ->{
                allCustomers.add(c);
            });
        });
        return allCustomers;
    }
    
}
