package commandPattern;

public class TurnOnDevice implements Command{
    private Device device;

    public TurnOnDevice(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.switchOn();
    }
}
