package behavior.command.temp;

/**
 * Created by run on 2017/10/30.
 */
public class SimpleRemoteControl {
    Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void onButtonWasPushed() {
        command.execute();
    }

    public void offButtonWasPushed() {
        command.undo();
    }
}
