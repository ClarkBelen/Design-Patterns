package facadePattern;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Integer service = 0;

        System.out.println("Welcome to our FrontDesk!");

        while(service != 4){
        System.out.println("\nHotel Services:");
        System.out.println("1. Valet Parking for Vehicles");
        System.out.println("2. Room Cleaning");
        System.out.println("3. Handling Luggage Carts");
        System.out.println("4. [Exit]");

            System.out.print("\nChoose a service number: ");
            service = input.nextInt();

            FrontDesk frontDesk = null;
            switch(service){
                case 1:
                    System.out.print("Enter the plate number: ");
                    String plateNumber = input.next();
                    HotelService valet = new Valet(plateNumber);
                    frontDesk = new FrontDesk(valet);
                    break;
                case 2:
                    System.out.print("Enter the room number: ");
                    Integer roomNumber = input.nextInt();
                    HotelService houseKeeping = new HouseKeeping(roomNumber);
                    frontDesk = new FrontDesk(houseKeeping);
                    break;
                case 3:
                    System.out.print("Enter the number of carts to be requested: ");
                    Integer numberOfCarts = input.nextInt();
                    HotelService cart = new Cart(numberOfCarts);
                    frontDesk = new FrontDesk(cart);
                    break;
                case 4:
                    System.out.println("Thank you for using Hotel App!");
                    input.close();
                    break;
                default:
                    System.out.println("Invalid option. Please try again!");
                    continue;
            }
            if(frontDesk != null){
                frontDesk.giveService();
            }
        }
    }
}
