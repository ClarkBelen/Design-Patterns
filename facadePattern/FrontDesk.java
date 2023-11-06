package facadePattern;

public class FrontDesk {
    private HotelService hotelService;

    public FrontDesk(HotelService service) {
        hotelService = service;
    }

    public void giveService(){
        hotelService.requestService();
    }

}
