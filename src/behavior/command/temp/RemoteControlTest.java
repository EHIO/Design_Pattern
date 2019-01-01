package behavior.command.temp;

/**
 * Created by run on 2017/10/30.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl src = new SimpleRemoteControl();
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        src.setCommand(lightOn);
        src.onButtonWasPushed();
        src.offButtonWasPushed();
        System.out.println("=====================");
        src.setCommand(lightOff);
        src.onButtonWasPushed();
        src.offButtonWasPushed();
    }
}
