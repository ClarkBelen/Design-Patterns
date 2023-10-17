public class TurnOffDevice implements Command {
    private Device device;

    public TurnOffDevice(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.switchOff();
    }
}
