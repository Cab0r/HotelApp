
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mario Barroso
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        do{
            System.out.println("\n\nWelcome to HOTEL-APP; The madafakin Hotels");
            opcion=Menu();
            switch(opcion){
                case 1:
                    System.out.println("Listar Habitaciones");
                    break;
                case 2:
                    System.out.println("Listar clientes");
                    break;
                case 3:
                    System.out.println("Listar Habitaiones ocupadas");
                    break;
                case 4:
                    System.out.println("Listar clientes en una habitacion");
                    break;
                case 5:
                    System.out.println("darse de alta");
                    break;
                case 6:
                    System.out.println("darse de baja");
                    break;
                    
                case 0:
                    System.out.println("See you later bro.");
                    break;
                default:
                    System.out.println("No valid option.");
                    break;
            }
        }while(opcion!=0);
    }

    private static int Menu() {
        System.out.println("1) List all rooms");
        System.out.println("2) List all clients");
        System.out.println("3) List ocuped rooms");
        System.out.println("4) List clients in a room");
        System.out.println("5) Check in");
        System.out.println("6) Check out");
        System.out.println("\n0) Exit");
        System.out.print("Option: ");
        try{
        return new Scanner(System.in).nextInt();
        }catch(InputMismatchException e){
            return -1;
        }
    }
    
}
