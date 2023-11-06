package adapterPattern;

public class SmartphoneAdapter implements PowerOutlet{
    public Smartphone smartphone;

    public SmartphoneAdapter(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public void plugIn() {
        smartphone.chargePhone();
    }

    @Override
    public void unPlug() {
        smartphone.unchargedPhone();
    }
}
