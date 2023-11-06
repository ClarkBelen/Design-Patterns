public class RefrigeratorAdapter implements PowerOutlet {
    public Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public void plugIn() {
        refrigerator.startCooling();
    }

    @Override
    public void unPlug() {
        refrigerator.stopCooling();
    }
}
