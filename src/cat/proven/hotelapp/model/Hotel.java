package cat.proven.hotelapp.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mario Barroso
 */
public class Hotel {
    private Map<Room, List<Customer>> hotel;
    
    public Hotel(){
        hotel= new HashMap<>();
    }
    
    public List<Room> ListAllRooms(){
        return null;
    }
    
}
