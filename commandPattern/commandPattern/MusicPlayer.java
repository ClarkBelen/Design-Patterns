package commandPattern;

public class MusicPlayer implements Device {

    private Integer volume = 50; //Default value of volume
    @Override
    public void switchOn() {
        System.out.println("Play Music");
    }

    @Override
    public void switchOff() {
        System.out.println("Stop Music");
    }

    @Override
    public void increaseAttribute() {
        volume+=5;
        System.out.println("Volume increased: " + volume + "%");
    }

    @Override
    public void decreaseAttribute() {
        volume-=5;
        System.out.println("Volume decreased: " + volume + "%");
    }
}
