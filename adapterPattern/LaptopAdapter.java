public class LaptopAdapter implements PowerOutlet{
    public Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void plugIn() {
        laptop.chargeLaptop();
    }

    @Override
    public void unPlug() {
        laptop.unchargedLaptop();
    }


}
