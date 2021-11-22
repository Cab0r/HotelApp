package cat.proven.hotelapp.model;

/**
 *
 * @author Mario Barroso
 */
public class Room {
    int id;
    int capacity;
    float price;

    public Room() {
        this.id=1;
        this.capacity=4;
        this.price=50;
    }

    public Room(int id, int capacity, float price) throws NegativeException {
        if(id<=0){
            throw new NegativeException("Room ID is negative.");
        }else this.id=id;
        if(capacity<=0){
            throw new NegativeException("Room capacity is negative.");
        }else this.capacity=capacity;
        if(price<0){
            throw new NegativeException("Room price is negative.");
        }else this.price=price;
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

    @Override
    public String toString() {
        return "Room{" + "capacity=" + capacity + ", price=" + price + '}';
    }
    
    
}
