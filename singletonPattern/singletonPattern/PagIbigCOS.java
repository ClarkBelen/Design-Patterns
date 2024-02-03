package singletonPattern;

import java.util.Scanner;

public class PagIbigCOS { //Pag-ibig Office Centralized Queuing System

    public static void main(String[] args) {

        QueuingManager cos = QueuingManager.getInstance();
        boolean start = true;

        while(start){
            Scanner scan = new Scanner(System.in);

            System.out.println("\nHELPDESK STATUS");
            cos.printHDStatus();

            System.out.println("\nAvailable queue no.: " + cos.getNextQueueNum());

            System.out.print("""
                    
                    MENU
                    1. Serve next queue number by Helpdesk station
                    2. Finish current queue number from Helpdesk station
                    3. Reset queuing number for Helpdesk stations
                    4. Add Helpdesk station [New]
                    5. Exit
                    
                    NOTE: INVALID inputs will go BACK to menu
                    """);
            System.out.print("Choose option: ");
            int input = scan.nextInt();

            switch(input){
                case 1:
                    System.out.print("Choose available station no.: ");
                    int stationToServe = scan.nextInt();

                    if(stationToServe >= 1 && stationToServe <= cos.getHdStations().size()) {
                        cos.serve(stationToServe, cos.getCurrentQueueNum());
                    }
                    else {
                        cos.setCurrentQueueNum(cos.getCurrentQueueNum()-1);
                        System.out.println("\nInvalid station number! Please try again.");
                    }
                    break;
                case 2:
                    System.out.print("Choose station no. to finish: ");
                    int stationToFinish = scan.nextInt();

                    if(stationToFinish >= 1 && stationToFinish <= cos.getHdStations().size()) {
                        cos.finish(stationToFinish);
                        System.out.println("Station " + stationToFinish + " is now available.");
                    }
                    else {
                        System.out.println("\nInvalid station number! Please try again.");
                    }
                    cos.setCurrentQueueNum(cos.getCurrentQueueNum()-1);
                    break;
                case 3:
                    System.out.print("Enter reset number for queuing.: ");
                    int resetNum = scan.nextInt();

                    cos.resetQueueNum(resetNum);
                    break;
                case 4:
                    cos.addHDStation();
                    cos.setCurrentQueueNum(cos.getCurrentQueueNum()-1);
                    break;
                case 5:
                    System.out.println("Thank you for using Pag-ibig COS! \n Programmer: Clark Belen");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid input. Please try again!");
                    cos.setCurrentQueueNum(cos.getCurrentQueueNum()-1);
            }
        }
    }
}
