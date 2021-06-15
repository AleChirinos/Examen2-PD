package command.basic;

public class ConcreteCommand2 implements  ICommand {
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        // se puede adicionar mas logica
        this.receiver.action2();
    }
}
