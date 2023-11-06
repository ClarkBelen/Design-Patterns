package facadePattern;

public class HouseKeeping implements HotelService{
    private Integer roomNumber;

    public HouseKeeping(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    private void cleanRoom(Integer roomNumber){
        System.out.println("Room no. " + roomNumber + " will be cleaned up soon!");
    }
    @Override
    public void requestService() {
        cleanRoom(roomNumber);
    }
}
