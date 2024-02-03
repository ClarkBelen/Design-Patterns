package commandPattern;

public class SmartHomeAutomation {
    public static void main (String[] args){

        RemoteControl controller;

        //Sending Commands on commandPattern.Thermostat commandPattern.Device
        Device thermostat = new Thermostat();
        Command turnOnThermostat = new TurnOnDevice(thermostat);
        Command increaseTemperature = new IncreaseAttribute(thermostat);
        Command decreaseTemperature = new DecreaseAttribute(thermostat);
        Command turnOffThermostat = new TurnOffDevice(thermostat);

        //Sending Commands on commandPattern.Lights commandPattern.Device
        Device lights = new Lights();
        Command turnOnLights = new TurnOnDevice(lights);
        Command increaseBrightness = new IncreaseAttribute(lights);
        Command decreaseBrightness = new DecreaseAttribute(lights);
        Command turnOffLights = new TurnOffDevice(lights);

        //Sending Commands on commandPattern.MusicPlayer commandPattern.Device
        Device musicPlayer = new MusicPlayer();
        Command turnOnMusicPlayer = new TurnOnDevice(musicPlayer);
        Command increaseVolume = new IncreaseAttribute(musicPlayer);
        Command decreaseVolume = new DecreaseAttribute(musicPlayer);
        Command turnOffMusicPlayer = new TurnOffDevice(musicPlayer);

        //Controlling commandPattern.Thermostat with commands through remote control
        controller = new RemoteControl(turnOnThermostat);
        controller.clickButton();
        controller = new RemoteControl(increaseTemperature);
        controller.clickButton();
        controller = new RemoteControl(decreaseTemperature);
        controller.clickButton();
        controller = new RemoteControl(turnOffThermostat);
        controller.clickButton();
        System.out.println();

        //Controlling commandPattern.Lights with commands through remote control
        controller = new RemoteControl(turnOnLights);
        controller.clickButton();
        controller = new RemoteControl(increaseBrightness);
        controller.clickButton();
        controller = new RemoteControl(decreaseBrightness);
        controller.clickButton();
        controller = new RemoteControl(turnOffLights);
        controller.clickButton();
        System.out.println();

        //Controlling Music player with commands through remote control
        controller = new RemoteControl(turnOnMusicPlayer);
        controller.clickButton();
        controller = new RemoteControl(increaseVolume);
        controller.clickButton();
        controller = new RemoteControl(decreaseVolume);
        controller.clickButton();
        controller = new RemoteControl(turnOffMusicPlayer);
        controller.clickButton();
    }
}
