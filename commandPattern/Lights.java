
public class Lights implements Device {
    private Integer brightness = 50;

    @Override
    public void switchOn() {
        System.out.println("Lights ON");
    }

    @Override
    public void switchOff() {
        System.out.println("Lights OFF");
    }

    @Override
    public void increaseAttribute() {
        brightness+=5;
        System.out.println("Brightness increased: " + brightness + "%");
    }

    @Override
    public void decreaseAttribute() {
        brightness-=5;
        System.out.println("Brightness decreased: " + brightness + "%");
    }
}
