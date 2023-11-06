package facadePattern;

public class Valet implements HotelService{
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    private void pickUpVehicle(String plateNumber){
        System.out.println("Vehicle with plate no. [" + plateNumber + "] will be picked up by Valet soon!");
    }
    @Override
    public void requestService() {
        pickUpVehicle(plateNumber);
    }
}
