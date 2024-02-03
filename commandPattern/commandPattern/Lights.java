package commandPattern;

public class Lights implements Device {
    private Integer brightness = 50;

    @Override
    public void switchOn() {
        System.out.println("commandPattern.Lights ON");
    }

    @Override
    public void switchOff() {
        System.out.println("commandPattern.Lights OFF");
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
