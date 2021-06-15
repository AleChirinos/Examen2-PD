package command.basic;

public class ConcreteCommand1 implements  ICommand {
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        // se puede adicionar mas logica
        this.receiver.action1();
    }
}
