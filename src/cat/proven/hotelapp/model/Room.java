package cat.proven.hotelapp.model;

/**
 *
 * @author Mario Barroso
 */
public class Room {
    int capacity;
    float price;

    public Room() {
        this.capacity=4;
        this.price=50;
    }

    public Room(int capacity, float price) {
        if(capacity>0) this.capacity = capacity;
        else this.capacity=4;
        if(price>0) this.price = price;
        else this.price=50;
    }
    
    

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity>0) this.capacity = capacity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price>0) this.price = price;
    }
    
    
}
