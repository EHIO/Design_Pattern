package behavior.command.temp;

/**
 * Created by run on 2017/10/30.
 */
public class LightOnCommand implements Command {
    Light light;


    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
