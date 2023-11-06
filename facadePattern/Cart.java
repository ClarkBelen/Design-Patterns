package facadePattern;

public class Cart implements HotelService{
    private Integer numberOfCarts;

    public Cart(Integer numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    private void requestCart(Integer numberOfCarts){
        System.out.println(numberOfCarts + " carts will be delivered soon!");
    }
    @Override
    public void requestService() {
        requestCart(numberOfCarts);
    }
}
