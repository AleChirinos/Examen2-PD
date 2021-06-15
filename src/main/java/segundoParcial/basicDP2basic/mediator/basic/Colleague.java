package mediator.basic;

public abstract class Colleague {
     protected IMediator mediator;

     public Colleague(IMediator mediator){
         this.mediator=mediator;
     }

     public abstract void send(String message);
     public abstract void messageReceived(String message);
}
