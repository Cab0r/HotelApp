package cat.proven.hotelapp.model;

/**
 *
 * @author Mario Barroso
 */
public class Customer {
    String name;
    String nif;

    public Customer(String name, String nif) {
        this.name = name;
        this.nif = nif;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    
}
