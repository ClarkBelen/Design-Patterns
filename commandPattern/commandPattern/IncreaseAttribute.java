package commandPattern;

public class IncreaseAttribute implements Command {
    private Device device;

    public IncreaseAttribute(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.increaseAttribute();
    }
}
