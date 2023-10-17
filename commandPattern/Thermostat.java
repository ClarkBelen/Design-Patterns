public class Thermostat implements Device{

    private Integer temperature = 74; //Default value of temperature by degrees Fahrenheit

    @Override
    public void switchOn() {
        System.out.println("Thermostat is ON");
    }

    @Override
    public void switchOff() {
        System.out.println("Thermostat is OFF");
    }

    @Override
    public void increaseAttribute() {
        temperature+=2;
        System.out.println("Temperature increased : " + temperature + " degrees Fahrenheit");
    }

    @Override
    public void decreaseAttribute() {
        temperature-=2;
        System.out.println("Temperature decreased: " + temperature + " degrees Fahrenheit");
    }
}
