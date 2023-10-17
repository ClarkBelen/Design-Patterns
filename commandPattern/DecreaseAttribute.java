public class DecreaseAttribute implements Command {
    private Device device;

    public DecreaseAttribute(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.decreaseAttribute();
    }
}
