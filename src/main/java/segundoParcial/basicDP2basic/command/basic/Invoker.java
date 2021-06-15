package command.basic;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommand> commandList = new ArrayList<>();

    public Invoker(){}

    public void addCommand(ICommand concreteCommand){
        commandList.add(concreteCommand);
    }

    public void executeCommands(){
        for (ICommand command: commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
