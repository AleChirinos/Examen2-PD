package mediator.basic;

public class ConcreateColleague1 extends Colleague {
    public ConcreateColleague1(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received C1 > "+message);
    }
}
