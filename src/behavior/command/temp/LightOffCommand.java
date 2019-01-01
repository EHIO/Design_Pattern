package behavior.command.temp;

/**
 * Created by run on 2017/10/30.
 */
public class LightOffCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }
}
