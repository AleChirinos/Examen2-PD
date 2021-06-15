package mediator.basic;

public class ConcreateColleague2 extends Colleague {
    public ConcreateColleague2(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received C2 > "+message);
    }
}
