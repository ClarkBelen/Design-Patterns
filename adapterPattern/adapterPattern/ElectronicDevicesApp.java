package adapterPattern;

import java.util.Scanner;

public class ElectronicDevicesApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Laptop\n" +
                                 "2. Smartphone\n" +
                                 "3. Refrigerator");
            System.out.print("Choose a device: ");
            Integer device = scanner.nextInt();

            System.out.println("1. Plug a commandPattern.Device");
            System.out.println("2. Unplug a commandPattern.Device");
            System.out.print("Choose an action: ");
            Integer action = scanner.nextInt();

            System.out.println();
            switch (device) {
                case 1: //Laptop
                    Laptop laptop = new Laptop();
                    PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
                    switch(action){
                        case 1: laptopOutlet.plugIn();
                            break;
                        case 2: laptopOutlet.unPlug();
                            break;
                        default: System.out.println("Invalid action. Please try again!");
                    }
                    break;
                case 2: //Smartphone
                    Smartphone smartphone = new Smartphone();
                    PowerOutlet smartphoneOutlet = new SmartphoneAdapter(smartphone);
                    switch(action){
                        case 1: smartphoneOutlet.plugIn();
                            break;
                        case 2: smartphoneOutlet.unPlug();
                            break;
                        default: System.out.println("Invalid action. Please try again!");
                    }
                    break;
                case 3: //Refrigerator
                    Refrigerator refrigerator = new Refrigerator();
                    PowerOutlet refOutlet = new RefrigeratorAdapter(refrigerator);
                    switch(action){
                        case 1: refOutlet.plugIn();
                            break;
                        case 2: refOutlet.unPlug();
                            break;
                        default: System.out.println("Invalid action. Please try again!");
                    }
                    break;
                default:
                    System.out.println("commandPattern.Device not located. Please try again!");
            }
            System.out.println();
        }
    }
}